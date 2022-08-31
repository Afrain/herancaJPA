package com.herancaJPA.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class EntidadeGenerica extends Entidade {

	@Column(name = "dt_cadastro")
	private LocalDateTime dataCadastro;

	@Column(name = "ativo")
	private Boolean status;
	
	
}
