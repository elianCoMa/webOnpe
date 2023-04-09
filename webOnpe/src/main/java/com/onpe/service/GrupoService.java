package com.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpe.model.Grupo;
import com.onpe.repository.IGrupo;

@Service
public class GrupoService implements IGrupoService{

	@Autowired
	private IGrupo igrupo;
	
	@Override
	public Grupo getGrupo(String id) {
		return igrupo.getGrupo(id);
	}

}
