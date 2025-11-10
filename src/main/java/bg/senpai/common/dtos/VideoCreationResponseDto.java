package bg.senpai.common.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoCreationResponseDto {
    private boolean success;
    private String statusCode;
    private String message;
    private String vidName;
}
