package bg.senpai.common.dtos;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TranslateSubtitleRequestDto {
    private String subtitleName;
}
