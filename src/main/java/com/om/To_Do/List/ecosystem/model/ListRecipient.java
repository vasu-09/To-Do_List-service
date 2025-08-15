package com.om.To_Do.List.ecosystem.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "list_recipients")
public class ListRecipient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long recipientUserId;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private ToDoList list;
}

