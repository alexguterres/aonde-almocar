package com.guterres.module.votacao.rest;

import org.springframework.web.bind.annotation.RestController;

import com.guterres.module.votacao.domain.Restaurant;
import com.guterres.module.votacao.domain.dto.VotingResponse;
import com.guterres.module.votacao.service.VotingService;
import com.guterres.module.votacao.service.impl.VotingServiceImpl;

@RestController
public class VotingController {
	
	private VotingService votingService = new VotingServiceImpl();

	public Restaurant result() {
		return null;
	}
	
	public VotingResponse vote(Long idUsuario, Long idRestaurant) {
		return votingService.vote(idUsuario, idRestaurant);
	}
}
