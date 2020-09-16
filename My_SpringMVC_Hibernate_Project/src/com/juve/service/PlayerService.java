package com.juve.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juve.entity.Player;
import com.juve.entity.PlayerDetail;


public interface PlayerService {
	
	public List<Player> getPlayers();
		
	
	public List<PlayerDetail> getPlayerDetails(int Id);


	public List<Player> getPlayer(int theId2);

}
