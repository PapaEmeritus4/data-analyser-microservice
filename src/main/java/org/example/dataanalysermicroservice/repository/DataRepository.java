package org.example.dataanalysermicroservice.repository;

import org.example.dataanalysermicroservice.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}