/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.dio.desafio5.service.implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.dio.desafio5.model.Cliente;
import edu.dio.desafio5.model.ClienteRepository;
import edu.dio.desafio5.model.Endereco;
import edu.dio.desafio5.model.EnderecoRepository;
import edu.dio.desafio5.service.ClientService;
import edu.dio.desafio5.service.ViaCepService;

/**
 *
 * @author Usuário
 */
@Service
public class ClientServiceImplement implements ClientService{
    
	@Autowired
	private ClienteRepository clienteRepository;
    
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ViaCepService viaCep;
	
    //TODO Singleton: injetar os componentes do Spring com @Autowired
    //TODO Strategy: implementar os metodos definidos na interface
    //TODO Facade: Abstrair integracoes com subsistemas, provendo uma interface simples

    @Override
    public Iterable<Cliente> buscarTodos() {
    	return clienteRepository.findAll();
    }


    @Override
    public void inserir(Cliente cliente) {
    	salvarDadosClienteComCep(cliente);
    }


	private void salvarDadosClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
    	
    	Endereco address = enderecoRepository.findById(cep).orElseGet(() -> {
    		Endereco newAddress = viaCep.consultarCep(cep);
    		enderecoRepository.save(newAddress);
    		return newAddress;
    	});

    	cliente.setEndereco(address);
    	clienteRepository.save(cliente);
	}

    @Override
    public void atualizar(Long id, Cliente cliente) {
    	Optional<Cliente> clienteCadastrado = clienteRepository.findById(id);
    	if(clienteCadastrado.isPresent()) {
    		salvarDadosClienteComCep(cliente);
    	}
    }

    @Override
    public void deletar(Long id) {
    	clienteRepository.deleteById(id);
    }

    @Override
    public Cliente buscarPorId(Long id) {
    	Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }
    
}
