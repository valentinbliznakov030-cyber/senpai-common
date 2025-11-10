package bg.senpai.common.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubtitlesDownloadRequestDto {
    private String animeTitle;
    private String subtitleName;
    private int episodeNumber;
}
