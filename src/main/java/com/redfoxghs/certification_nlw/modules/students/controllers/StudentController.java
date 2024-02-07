package com.redfoxghs.certification_nlw.modules.students.controllers;

import com.redfoxghs.certification_nlw.modules.students.dtos.VerifyIfHasCertificationDTO;
import com.redfoxghs.certification_nlw.modules.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO){

        if(studentService.verifyIfHasCertification(verifyIfHasCertificationDTO)){
            return "Usuário já fez a prova!";
        }

        return "Usuário pode fazer a prova!";
    }
}
