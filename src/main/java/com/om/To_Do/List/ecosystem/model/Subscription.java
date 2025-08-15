package com.om.To_Do.List.ecosystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "subscriptions")
public class Subscription {

    @Id
    private Long userId;

    private String subscriptionId;   // Razorpay subscription ID

    private LocalDate startDate;
    private LocalDate expiryDate;
    private Boolean isActive;

    // New fields for failure tracking:
    private Integer failureCount = 0;
    private LocalDateTime lastFailureAt;
}

