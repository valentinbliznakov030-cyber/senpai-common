package bg.senpai.common.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubtitlesDownloadedResponseDto {
    private boolean success;
    private int statusCode;
    private String message;
    private String subtitleName;
}
