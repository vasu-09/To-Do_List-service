package com.om.To_Do.List.ecosystem.dto;


import lombok.Data;

@Data
public class UpdateChecklistItemRequest {
    private String itemName; // only field allowed for checklist updates
}
