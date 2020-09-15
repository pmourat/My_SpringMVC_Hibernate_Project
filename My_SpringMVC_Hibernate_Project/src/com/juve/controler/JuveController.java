package com.juve.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juve.dao.PlayerDAO;
import com.juve.dao.PlayerDetailsDAO;
import com.juve.entity.Player;

@Controller
@RequestMapping("/juve/")
public class JuveController {
	
	@Autowired
	private PlayerDAO playerDAO;
	@Autowired
	private PlayerDetailsDAO playerDetailsDAO;
	
	@GetMapping("/players")
	public String listPlayers(Model theModel) {
		
		List<Player> thePlayers = playerDAO.getPlayers();
		
		theModel.addAttribute("players",thePlayers);
		
		return "list-players";
	}

}
