package com.guterres.module.votacao.domain;

import java.util.List;

public class Restaurant {

	private Long id;
	private List<Vote> votos; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Vote> getVotos() {
		return votos;
	}

	public void setVotos(List<Vote> votos) {
		this.votos = votos;
	}
	
	
}
