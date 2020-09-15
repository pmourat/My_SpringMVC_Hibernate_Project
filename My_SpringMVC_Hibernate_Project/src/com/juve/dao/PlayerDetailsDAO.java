package com.juve.dao;

import java.util.List;

import com.juve.entity.PlayerDetail;


public interface PlayerDetailsDAO {
	
	public List<PlayerDetail> getPlayerDetails(int theId);


}
