package com.redfoxghs.certification_nlw.modules.questions.dtos;

import com.redfoxghs.certification_nlw.modules.questions.entities.AlternativesEntiry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlternativesResultDTO {

    private UUID id;
    private String description;

    public static List<AlternativesResultDTO> toListDTO(List<AlternativesEntiry> entities) {
        return entities.stream().map(entity -> new AlternativesResultDTO(entity.getId(), entity.getDescription())).toList();
    }

}
