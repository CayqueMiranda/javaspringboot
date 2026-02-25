package com.sm.demo.repositories;

import com.sm.demo.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <AlunoModel, Long> {
}
