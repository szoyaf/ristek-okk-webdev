package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Panitia;

public interface PanitiaRepository extends JpaRepository<Panitia,Long> {
}