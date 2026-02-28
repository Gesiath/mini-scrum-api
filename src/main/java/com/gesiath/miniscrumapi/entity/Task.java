package com.gesiath.miniscrumapi.entity;

import com.gesiath.miniscrumapi.enumerator.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 100)
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate doDate;
    @Column(nullable = false, updatable = false)
    private LocalDate createdAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDate.now();
    }

}
