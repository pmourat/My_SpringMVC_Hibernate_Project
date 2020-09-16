package com.juve.dao;

import java.util.List;

import com.juve.entity.Player;

public interface PlayerDAO {
	
	public List<Player> getPlayers();

	public List<Player> getPlayer(int theId2);
}
