package bg.senpai.common.dtos;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionUpgradeDTO {
    private UUID userId;
    private String newPlan;
}
