package com.example.demoHungTat.repository;

import com.example.demoHungTat.entity.KhoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepository extends JpaRepository<KhoaEntity,String> {
}
