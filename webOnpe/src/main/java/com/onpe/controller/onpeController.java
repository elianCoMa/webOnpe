package com.onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.onpe.service.GrupoService;

public class onpeController {

	@Autowired
	GrupoService grupoService;
	
	@GetMapping("/grupo/{idx}")
	public String getGrupo(@PathVariable("id") String id , Model model) {
		model.addAttribute("grupo",grupoService.getGrupo(id));
		return "grupo";
	}
	
}
