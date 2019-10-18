package com.escen.ecole.controllers;

import com.escen.ecole.entities.Student;
import com.escen.ecole.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/students")
public class StudentController {

    @Autowired
    IStudentRepository studentRepository;

    @GetMapping()
    public @ResponseBody List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Student getOneById(@PathVariable("id") Long id){
        return studentRepository.getOne(id);
    }

    @PostMapping()
    public @ResponseBody Student addNewStudent(@RequestBody Student newStudent){
        return studentRepository.save(newStudent);
    }

    @PutMapping("/{id")
    public @ResponseBody Student updateStudent(@RequestBody Student updatedStudent){
        return studentRepository.save(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody Boolean deleteStudent(@PathVariable("id") Long id){
        try {
            studentRepository.deleteById(id);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
