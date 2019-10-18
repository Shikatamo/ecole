package com.escen.ecole.controllers;

import com.escen.ecole.entities.Professor;
import com.escen.ecole.repositories.IProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/professor")
public class ProfessorController {
    
    @Autowired
    IProfessorRepository professorRepository;

    @GetMapping()
    public @ResponseBody
    List<Professor> getAllProfessors(){
        return professorRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Professor getOneById(@PathVariable("id") Long id){
        return professorRepository.getOne(id);
    }

    @PostMapping()
    public @ResponseBody Professor addNewProfessor(@RequestBody Professor newProfessor){
        return professorRepository.save(newProfessor);
    }

    @PutMapping("/{id")
    public @ResponseBody Professor updateProfessor(@RequestBody Professor updatedProfessor){
        return professorRepository.save(updatedProfessor);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody Boolean deleteProfessor(@PathVariable("id") Long id){
        try {
            professorRepository.deleteById(id);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
