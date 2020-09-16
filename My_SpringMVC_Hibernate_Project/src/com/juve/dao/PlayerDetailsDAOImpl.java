package com.juve.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.juve.entity.PlayerDetail;

@Repository
public class PlayerDetailsDAOImpl implements PlayerDetailsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<PlayerDetail> getPlayerDetails(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		PlayerDetail playerDetails = currentSession.get(PlayerDetail.class, theId);		
		List<PlayerDetail> s = new ArrayList<>();	
		s.add(playerDetails);
		return s;
		
	}

}
