package com.om.To_Do.List.ecosystem.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ToDoItemDTO {
    private String itemName;
    private String quantity;
    private String priceText;
    private String subQuantitiesJson;
}
