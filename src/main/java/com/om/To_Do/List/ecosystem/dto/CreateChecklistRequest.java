package com.om.To_Do.List.ecosystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreateChecklistRequest {
    private Long createdByUserId;
    private String title;
    private List<ChecklistItemDTO> items;

    @Data
    public static class ChecklistItemDTO {
        private String itemName;
    }
}