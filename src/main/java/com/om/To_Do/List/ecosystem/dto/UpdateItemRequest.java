package com.om.To_Do.List.ecosystem.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UpdateItemRequest {
    private String itemName;
    private String quantity;
    private String priceText;
    private String subQuantitiesJson;
}