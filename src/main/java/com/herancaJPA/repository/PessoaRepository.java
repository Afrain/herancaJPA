package com.herancaJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herancaJPA.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
