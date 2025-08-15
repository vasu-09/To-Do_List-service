package com.om.To_Do.List.ecosystem.dto;

import lombok.Data;
import java.util.List;

@Data
public class ToDoListSummaryDTO {
    private String title;
    private List<ToDoItemDTO> items;
}
