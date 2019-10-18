package com.escen.ecole.composites;

import com.escen.ecole.entities.Klass;
import com.escen.ecole.entities.Professor;
import com.escen.ecole.entities.Student;

public class StudentKlassProfessor {

    private Student student;

    private Klass klass;

    private Professor professor;

    public StudentKlassProfessor() {}

    public StudentKlassProfessor(Student student, Klass klass, Professor professor) {
        this.student = student;
        this.klass = klass;
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
