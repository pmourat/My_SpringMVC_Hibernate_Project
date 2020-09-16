package com.juve.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juve.dao.PlayerDAO;
import com.juve.dao.PlayerDetailsDAO;
import com.juve.entity.Player;
import com.juve.entity.PlayerDetail;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerDAO playerDAO;
	
	@Autowired
	private PlayerDetailsDAO playerDetailsDAO;

	@Override
	@Transactional
	public List<Player> getPlayers() {
		return playerDAO.getPlayers();
	}

	@Override
	@Transactional
	public List<PlayerDetail> getPlayerDetails(int Id) {
		return playerDetailsDAO.getPlayerDetails(Id);
	}

	@Override
	public List<Player> getPlayer(int theId2) {
		return playerDAO.getPlayer(theId2);
	}

	
}
