package com.herancaJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herancaJPA.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
