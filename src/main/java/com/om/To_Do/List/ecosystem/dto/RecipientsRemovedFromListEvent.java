package com.om.To_Do.List.ecosystem.dto;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Getter
public class RecipientsRemovedFromListEvent {
    private Long listId;
    private String listName;
    private Long removerUserId;
    private Long removedUserId;

    public RecipientsRemovedFromListEvent(Long listId,
                                          String listName,
                                          Long removerUserId,
                                          Long removedUserId) {
        this.listId         = listId;
        this.listName       = listName;
        this.removerUserId  = removerUserId;
        this.removedUserId  = removedUserId;
    }
}
