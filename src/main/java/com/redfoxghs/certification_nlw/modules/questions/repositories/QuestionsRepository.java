package com.redfoxghs.certification_nlw.modules.questions.repositories;

import com.redfoxghs.certification_nlw.modules.questions.entities.QuestionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface QuestionsRepository extends JpaRepository<QuestionsEntity, UUID> {

    List<QuestionsEntity> findByTechnology(String technology);
}
