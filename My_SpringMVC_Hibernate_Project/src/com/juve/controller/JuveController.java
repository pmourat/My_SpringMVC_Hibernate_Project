package com.juve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.juve.entity.Player;
import com.juve.service.PlayerService;

@Controller
@RequestMapping("/juve/")
public class JuveController {
	
	@Autowired
	private PlayerService playerService;
	
	@GetMapping("/players")
	public String listPlayers(Model theModel) {
		
		List<Player> thePlayers = playerService.getPlayers();
		
		theModel.addAttribute("players",thePlayers);
		
		return "list-players";
	}
	


	@GetMapping("/formForAdd")
	public String formForAdd(Model theModel) {
		Player thePlayer = new Player();
		theModel.addAttribute("player",thePlayer);
		return "player-form";
		
	}
	
	@PostMapping("/savePlayer")
	public String savePlayer (@ModelAttribute("player")Player thePlayer,Model theModel){
		playerService.savePlayer(thePlayer);
		
		return "redirect:players";
		
		
	}
	
	@GetMapping("/deletePlayer")
	public String deletePlayer(@RequestParam("playerId") int theId,Model theModel) {
		
		playerService.deletePlayer(theId);
	
		return "redirect:players";	
			}

	

	@GetMapping("/editPlayer")
	public String editPlayer(@RequestParam("playerId") int theId,Model theModel) {
 	Player thePlayer = playerService.getPlayer(theId);
		
		theModel.addAttribute("player",thePlayer);
		return "player-form";	
			}
	
	
}