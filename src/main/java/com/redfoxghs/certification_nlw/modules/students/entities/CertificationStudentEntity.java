package com.redfoxghs.certification_nlw.modules.students.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "certifications")
public class CertificationStudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JoinColumn(name = "student_id")
    private UUID studentID;

    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private StudentEntity studentEntity;

    @Column(length = 100)
    private String technology;

    @Column(length = 10)
    private int grate;

    @OneToMany
    @JoinColumn(name = "answers_certification_id", insertable = false, updatable = false)
    private List<AnswersCertification> answersCertification;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
