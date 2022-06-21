package com.samira.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samira.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
