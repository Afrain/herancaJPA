package com.herancaJPA;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.herancaJPA.model.Aluno;
import com.herancaJPA.model.Funcionario;
import com.herancaJPA.repository.AlunoRepository;
import com.herancaJPA.repository.FuncionarioRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@SpringBootApplication
public class HerancaJpaApplication implements CommandLineRunner {
	
	private FuncionarioRepository funcionarioRepository;
	private AlunoRepository alunoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HerancaJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId(null);
		funcionario.setDataCadastro(LocalDateTime.now());
		funcionario.setStatus(true);
		funcionario.setNome("Afrain");
		funcionario.setIdade(10);
		funcionario.setCargo("Técnico");
		funcionario.setSalario(3000);
		funcionarioRepository.save(funcionario);
		
		Aluno aluno = new Aluno();
		aluno.setId(null);
		aluno.setDataCadastro(LocalDateTime.now());
		aluno.setStatus(true);
		aluno.setNome("Larissa");
		aluno.setIdade(28);
		aluno.setNota(9.8);
		aluno.setFalta(10);
		alunoRepository.save(aluno);
		
	}

}
