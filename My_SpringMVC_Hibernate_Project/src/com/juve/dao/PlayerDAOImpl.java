package com.juve.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.juve.entity.Player;

@Repository
public class PlayerDAOImpl implements PlayerDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	@Transactional
	public List<Player> getPlayers() {
		Session currentSession = sessionfactory.getCurrentSession();
		Query<Player> theQuery = 
				currentSession.createQuery("from Player order by lastName",Player.class);
		List<Player> players = theQuery.getResultList();
		return players;
	}

}
