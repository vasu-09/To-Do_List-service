package com.om.To_Do.List.ecosystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateListRequest {

    private Long createdByUserId;
    private String title;
    private List<ToDoItemDTO> items;
}
