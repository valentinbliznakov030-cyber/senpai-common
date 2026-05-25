package bg.senpai.common.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubtitlesDownloadRequestDTO {
    private String subtitleUrl;
}
