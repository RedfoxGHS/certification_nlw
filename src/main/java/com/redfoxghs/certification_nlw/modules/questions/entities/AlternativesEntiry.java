package com.redfoxghs.certification_nlw.modules.questions.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "alternatives")
public class AlternativesEntiry {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JoinColumn(name = "question_id")
    private UUID questionID;

    private String description;

    @Column(name = "is_correct")
    private boolean isCorrect;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
