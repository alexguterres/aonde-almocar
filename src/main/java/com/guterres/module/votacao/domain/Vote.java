package com.guterres.module.votacao.domain;


public class Vote {

	private Long id;
	
	private Restaurant restaurante;
	private User usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Restaurant getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurant restaurante) {
		this.restaurante = restaurante;
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	
}
