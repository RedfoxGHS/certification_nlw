package com.redfoxghs.certification_nlw.modules.questions.dtos;

import com.redfoxghs.certification_nlw.modules.questions.entities.QuestionsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionResultDTO {

    private UUID id;
    private String technology;
    private String description;

    private List<AlternativesResultDTO> alternatives;

    public static QuestionResultDTO toDTO(QuestionsEntity entity) {
        return new QuestionResultDTO(entity.getId(), entity.getTechnology(), entity.getDescription(), AlternativesResultDTO.toListDTO(entity.getAlternatives()));
    }

    public static List<QuestionResultDTO> toListDTO(List<QuestionsEntity> entities) {
        return entities.stream().map(QuestionResultDTO::toDTO).toList();
    }
}
