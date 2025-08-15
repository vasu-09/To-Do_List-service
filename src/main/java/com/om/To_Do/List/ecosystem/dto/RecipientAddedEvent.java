package com.om.To_Do.List.ecosystem.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class RecipientAddedEvent {
    private final Long listId;
    private final String listName;
    private final Long creatorUserId;
    private final List<Long> newUserIds;
}