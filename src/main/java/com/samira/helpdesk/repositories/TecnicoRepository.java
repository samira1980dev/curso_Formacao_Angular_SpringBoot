package com.samira.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samira.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
