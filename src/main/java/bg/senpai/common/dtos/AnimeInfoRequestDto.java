package bg.senpai.common.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnimeInfoRequestDto {
    private String animeTitle;
    private int episodeNumber;
    private String m3u8Link;
}

