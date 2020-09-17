package com.juve.service;

import java.util.List;


import com.juve.entity.Player;


public interface PlayerService {
	
	public List<Player> getPlayers();
		
	


	public Player getPlayer(int theId2);


	public Player savePlayer(Player thePlayer);




	public Player deletePlayer(int theId);



}
