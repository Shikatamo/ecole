package com.escen.ecole.services;

import com.escen.ecole.composites.StudentKlassProfessor;
import com.escen.ecole.entities.Klass;
import com.escen.ecole.entities.Professor;
import com.escen.ecole.entities.Student;
import com.escen.ecole.repositories.IKlassRepository;
import com.escen.ecole.repositories.IProfessorRepository;
import com.escen.ecole.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentKlassProfessorService {

    @Autowired
    IStudentRepository studentRepository;

    @Autowired
    IProfessorRepository professorRepository;

    @Autowired
    IKlassRepository klassRepository;

    public StudentKlassProfessor getOneById(Long id){
        Student student = studentRepository.getOne(id);
        Klass klass = klassRepository.getOne(student.getClassId());
        Professor professor = professorRepository.getOne(klass.getProfessorId());

        return new StudentKlassProfessor(student, klass, professor);
    }
}
