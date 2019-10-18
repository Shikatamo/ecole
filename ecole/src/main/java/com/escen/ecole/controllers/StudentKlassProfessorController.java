package com.escen.ecole.controllers;

import com.escen.ecole.composites.StudentKlassProfessor;
import com.escen.ecole.entities.Klass;
import com.escen.ecole.entities.Professor;
import com.escen.ecole.entities.Student;
import com.escen.ecole.repositories.IKlassRepository;
import com.escen.ecole.repositories.IProfessorRepository;
import com.escen.ecole.repositories.IStudentRepository;
import com.escen.ecole.services.StudentKlassProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/student-klass-professor")
public class StudentKlassProfessorController {

    @Autowired
    StudentKlassProfessorService studentKlassProfessorService;

    @GetMapping("/{id}")
    public @ResponseBody StudentKlassProfessor getOneById(@PathVariable("id") Long id){
        return studentKlassProfessorService.getOneById(id);
    }
}
