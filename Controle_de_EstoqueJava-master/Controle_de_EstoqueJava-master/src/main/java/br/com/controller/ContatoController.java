
package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Contato;
import br.com.service.ContatoService;



@RestController
@RequestMapping(path = "/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoService service;
	
	@PostMapping(path = "/salvar")
	public ResponseEntity<?> salvar (@RequestBody Contato contato){
		Contato pro = this.service.salvar(contato);
		return ResponseEntity.ok().body(pro);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
