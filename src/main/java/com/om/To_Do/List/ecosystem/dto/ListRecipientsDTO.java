package com.om.To_Do.List.ecosystem.dto;

import lombok.Data;
import java.util.List;

@Data
public class ListRecipientsDTO {
    private Long listId;
    private String title;
    private List<Long> recipientUserIds;
}
