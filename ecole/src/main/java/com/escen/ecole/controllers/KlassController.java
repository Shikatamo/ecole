package com.escen.ecole.controllers;

import com.escen.ecole.entities.Klass;
import com.escen.ecole.repositories.IKlassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/klass")
public class KlassController {

    @Autowired
    IKlassRepository klassRepositoy;

    @GetMapping()
    public @ResponseBody List<Klass> getAllStudents(){
        return klassRepositoy.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Klass getOneById(@PathVariable("id") Long id){
        return klassRepositoy.getOne(id);
    }

    @PostMapping()
    public @ResponseBody Klass addNewStudent(@RequestBody Klass newStudent){
        return klassRepositoy.save(newStudent);
    }

    @PutMapping("/{id")
    public @ResponseBody Klass updateStudent(@RequestBody Klass updatedStudent){
        return klassRepositoy.save(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody Boolean deleteStudent(@PathVariable("id") Long id){
        try {
            klassRepositoy.deleteById(id);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
