package com.redfoxghs.certification_nlw.modules.questions.controllers;

import com.redfoxghs.certification_nlw.modules.questions.dtos.QuestionResultDTO;
import com.redfoxghs.certification_nlw.modules.questions.entities.QuestionsEntity;
import com.redfoxghs.certification_nlw.modules.questions.repositories.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionsRepository questionsRepository;

    @GetMapping("/technology/{technology}")
    public List<QuestionResultDTO> findByTechnology(@PathVariable String technology) {
        return mapToDTO(this.questionsRepository.findByTechnology(technology));
    }

    static List<QuestionResultDTO> mapToDTO(List<QuestionsEntity> entity) {
        return QuestionResultDTO.toListDTO(entity);
    }
}
