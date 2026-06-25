package bg.senpai.common.config;

import lombok.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberData {
    private UUID userId;
    private String username;
    private List<SimpleGrantedAuthority> roles;
}
