package com.redfoxghs.certification_nlw.modules.students.services;

import com.redfoxghs.certification_nlw.modules.students.dtos.VerifyIfHasCertificationDTO;
import com.redfoxghs.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.redfoxghs.certification_nlw.modules.students.repositories.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean verifyIfHasCertification(VerifyIfHasCertificationDTO dto) {
        List<CertificationStudentEntity> certifications =
                this.certificationStudentRepository.findByStudentEntityEmailAndTechnology(dto.getEmail(), dto.getTechnology());

        return !certifications.isEmpty();
    }
}
