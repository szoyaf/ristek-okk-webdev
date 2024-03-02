package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Fakultas;

public interface FakultasRepository extends JpaRepository<Fakultas,Long> {
}