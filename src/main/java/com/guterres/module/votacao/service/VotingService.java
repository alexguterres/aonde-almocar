package com.guterres.module.votacao.service;

import com.guterres.module.votacao.domain.dto.VotingResponse;

public interface VotingService {
	
	public VotingResponse vote(Long idUsuario, Long idRestaurent);

}
