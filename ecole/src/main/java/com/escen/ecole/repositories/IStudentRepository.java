package com.escen.ecole.repositories;

import com.escen.ecole.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long>{
}
