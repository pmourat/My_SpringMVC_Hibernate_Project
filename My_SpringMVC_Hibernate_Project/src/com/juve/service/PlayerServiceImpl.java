package com.juve.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juve.dao.PlayerDAO;
import com.juve.entity.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerDAO playerDAO;
	
	
	@Override
	@Transactional
	public List<Player> getPlayers() {
		return playerDAO.getPlayers();
	}

	

	@Override
	@Transactional
	public Player getPlayer(int theId2) {
		return playerDAO.getPlayer(theId2);
	}

	@Override
	@Transactional
	public Player savePlayer(Player thePlayer) {
		
		return  playerDAO.savePlayer(thePlayer);
	}



	@Override
	@Transactional
	public Player deletePlayer(int theId) {
		return playerDAO.deletePLayer(theId);
	}

	
	
}
