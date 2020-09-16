package com.juve.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.juve.entity.Player;

@Repository
public class PlayerDAOImpl implements PlayerDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<Player> getPlayers() {
		Session currentSession = sessionfactory.getCurrentSession();
		Query<Player> theQuery = 
				currentSession.createQuery("from Player order by id",Player.class);
		List<Player> players = theQuery.getResultList();
		return players;
	}

	@Override
	public List<Player> getPlayer(int theId2) {
		Session currentSession = sessionfactory.getCurrentSession();
		Player thePlayer = currentSession.get(Player.class, theId2);
		List<Player> p = new ArrayList<>();
		return p;
	}

}
