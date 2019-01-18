package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonne extends JpaRepository<Personne, Long>{
}

