package com.samira.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samira.helpdesk.domain.Chamado;
import com.samira.helpdesk.domain.Cliente;
import com.samira.helpdesk.domain.Tecnico;
import com.samira.helpdesk.domain.enums.Perfil;
import com.samira.helpdesk.domain.enums.Prioridade;
import com.samira.helpdesk.domain.enums.Status;
import com.samira.helpdesk.repositories.ChamadoRepository;
import com.samira.helpdesk.repositories.ClienteRepository;
import com.samira.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Samira Marcela Roman", "69794229016", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "39840927094", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
