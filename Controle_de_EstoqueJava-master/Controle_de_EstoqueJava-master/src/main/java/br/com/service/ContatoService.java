
package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.model.Contato;
import br.com.repository.ContatoRepository;


@Service
public class ContatoService {

	@Autowired
	private ContatoRepository repository;

	
	@Transactional
	public Contato salvar(Contato contato) {
		return this.repository.save(contato);
	}

	@Transactional(readOnly=true)
	public List<Contato> listar() {
		return this.repository.findAll();
	}
	
	@Transactional
	public void excluir (Contato contato) {
		this.repository.delete(contato);
	}
	
	@Transactional
	public void editar(Contato contato) {
		this.repository.saveAndFlush(contato);
	}
	
	@Transactional
	public void deletarForID(Integer id) {
		this.repository.deleteById(id);
	}
	
	@Transactional
	public void editaForID(Integer id) {
		this.repository.getOne(id);
	}
	

}
