package bg.senpai.common.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoCreationRequestDto {
    private String m3u8Link;
    private String vidName;
}
