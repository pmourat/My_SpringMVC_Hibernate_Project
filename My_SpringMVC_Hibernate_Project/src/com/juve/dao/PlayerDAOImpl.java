package com.juve.dao;

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
	private SessionFactory sessionFactory;
	
	@Override
	public List<Player> getPlayers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Player> theQuery = 
				currentSession.createQuery("from Player order by id",Player.class);
		List<Player> players = theQuery.getResultList();
		return players;
	}

	@Override
	public Player getPlayer(int theId2) {
		Session currentSession = sessionFactory.getCurrentSession();
		Player thePlayer = currentSession.get(Player.class, theId2);
		return thePlayer;
	}

	@Override
	public Player savePlayer(Player thePlayer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(thePlayer);
		return null;
	}

	@Override
	public Player deletePLayer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Player myPlayer = currentSession.get(Player.class, theId);
		currentSession.delete(myPlayer);
		return null;
	}

}
