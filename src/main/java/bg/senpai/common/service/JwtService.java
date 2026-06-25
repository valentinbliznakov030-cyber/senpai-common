package bg.senpai.common.service;

import bg.senpai.common.enums.Role;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.List;

@Component
public class JwtService {
    @Value("${jwt.secret}")
    private String secret;

    public List<Role> getRoles(String token) {
        List<String> roleNames = Jwts.parserBuilder()
                .setSigningKey(getHmacKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .get("roles", List.class);

        return roleNames.stream()
                .map(Role::valueOf)
                .toList();
    }

    public String getUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getHmacKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .get("username", String.class);
    }



    public String getUserId(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getHmacKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }


    public boolean validateJwtToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(getHmacKey()).build().parseClaimsJws(token);
            return true;
        } catch (SecurityException e) {
            System.out.println("Invalid JWT signature: " + e.getMessage());
        } catch (MalformedJwtException e) {
            System.out.println("Invalid JWT token: " + e.getMessage());
        } catch (ExpiredJwtException e) {
            System.out.println("JWT token is expired: " + e.getMessage());
        } catch (UnsupportedJwtException e) {
            System.out.println("JWT token is unsupported: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("JWT claims string is empty: " + e.getMessage());
        }
        return false;
    }

    private Key getHmacKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

}

