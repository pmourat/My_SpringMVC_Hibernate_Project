package com.juve.dao;

import java.util.List;

import com.juve.entity.Player;

public interface PlayerDAO {
	
	public List<Player> getPlayers();

	public Player getPlayer(int theId2);

	public Player savePlayer(Player thePlayer);

	public Player deletePLayer(int theId);
}
