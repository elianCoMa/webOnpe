package com.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onpe.model.Grupo;

@Repository
public interface IGrupo extends JpaRepository<Grupo, String> {

	@Query(value = "{call ups_getGrupoVotacion (:id)}" , nativeQuery = true)
	Grupo getGrupo(String id);
}
