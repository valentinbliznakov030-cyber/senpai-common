package bg.senpai.common.dtos;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnimeM3U8LinkDto {
    private boolean success;
    private String statusCode;
    private String message;
    private String m3u8Link;
}
