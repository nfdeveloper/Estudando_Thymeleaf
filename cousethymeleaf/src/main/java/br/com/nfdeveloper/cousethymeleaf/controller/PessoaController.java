package br.com.nfdeveloper.cousethymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.nfdeveloper.cousethymeleaf.model.Pessoa;
import br.com.nfdeveloper.cousethymeleaf.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping("/cadastropessoa")
	public String inicio() {
		return "cadastro/cadastropessoa";
	}
	
	@PostMapping("/salvarpessoa")
	public String salvar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return "cadastro/cadastropessoa"; 
	}
}
