package com.om.To_Do.List.ecosystem.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "todo_items")
public class ToDoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;       // e.g., "Sugar"

    private String quantity;       // e.g., "1kg pack" (optional)

    private String priceText;      // e.g., "₹50" (optional)

    @Lob
    @Column(columnDefinition = "TEXT")
    private String subQuantitiesJson; // JSON string for sub-quantities (optional)

    @ManyToOne
    @JoinColumn(name = "list_id")
    private ToDoList list;
}
