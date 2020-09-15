package com.juve.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.juve.entity.PlayerDetail;

@Repository
public class PlayerDetailsDAOImpl implements PlayerDetailsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<PlayerDetail> getPlayerDetails(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<PlayerDetail> theQuery = 
				currentSession.createQuery("from PlayerDetail order by id",PlayerDetail.class);
		List<PlayerDetail> playerDetails = theQuery.getResultList();		
		return playerDetails;
		
	}

}
