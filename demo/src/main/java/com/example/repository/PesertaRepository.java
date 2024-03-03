package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Peserta;

public interface PesertaRepository extends JpaRepository<Peserta,Long> {
}