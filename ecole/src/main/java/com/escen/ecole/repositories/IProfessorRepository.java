package com.escen.ecole.repositories;

import com.escen.ecole.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfessorRepository extends JpaRepository<Professor, Long> {
}
