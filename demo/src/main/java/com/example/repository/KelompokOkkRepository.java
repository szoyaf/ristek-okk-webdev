package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.KotlinBeanInfoFactory;

import com.example.model.KelompokOkk;

public interface KelompokOkkRepository extends JpaRepository<KelompokOkk,Long> {
    @Query(
        value = "SELECT * FROM kelompok_okk WHERE mentor_id = ?1 limit 1", 
        nativeQuery = true
    )
    KelompokOkk findByMentorID(long mentor_id);
}