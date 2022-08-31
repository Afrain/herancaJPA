package com.herancaJPA.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Funcionario extends Pessoa {

	private double salario;
	private String cargo;

}
