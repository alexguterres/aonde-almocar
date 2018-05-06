package com.guterres.aondealmocar;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.guterres.module.votacao.domain.Restaurant;
import com.guterres.module.votacao.domain.User;
import com.guterres.module.votacao.domain.dto.VotingResponse;
import com.guterres.module.votacao.rest.VotingController;
import com.guterres.module.votacao.service.VotingService;
import com.guterres.module.votacao.service.impl.VotingServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AondeAlmocarApplicationTests {
	
	private User user;
	private List<Restaurant> restaurants; 

	@Test
	public void contextLoads() {
			
	}
	
	@Before
	public void mountUserRestaurant() {
		user = new User();
		user.setId(1l);
		user.setNome("Alex Guterres");
		
		restaurants = new ArrayList<Restaurant>();
		
		Restaurant restaurant = new Restaurant();

		restaurant.setId(1l);
		restaurants.add(restaurant);
		
		restaurant = new Restaurant();
		restaurant.setId(2l);
		restaurants.add(restaurant);
		
		restaurant = new Restaurant();
		restaurant.setId(3l);
		restaurants.add(restaurant);
		
	}
	
//	@Test
	public void shouldReceiveResult() {
		VotingController almocarController = new VotingController();
		Restaurant restaurante = almocarController.result();
		Assert.assertEquals(new Long(1), restaurante.getId()); 
	}

	@Test
	public void shouldVote() {
		VotingService votingService = new VotingServiceImpl(); 
		VotingResponse votingResponse = votingService.vote(user.getId(), 2l);
		
	}
}
