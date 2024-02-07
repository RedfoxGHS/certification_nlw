package com.redfoxghs.certification_nlw.modules.students.services;

import com.redfoxghs.certification_nlw.modules.students.dtos.VerifyIfHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public boolean verifyIfHasCertification(VerifyIfHasCertificationDTO dto) {
        return dto.getEmail().equals("gabriel@teste.com") && dto.getTechnology().equals("JAVA");
    }
}
