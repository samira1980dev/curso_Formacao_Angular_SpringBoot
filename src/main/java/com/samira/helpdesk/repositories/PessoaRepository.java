package com.samira.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samira.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
