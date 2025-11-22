package bg.senpai.common.dtos;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TranslateSubtitleResponseDto {
    private boolean success;
    private String statusCode;
    private String message;
    private String subtitleName;
}
