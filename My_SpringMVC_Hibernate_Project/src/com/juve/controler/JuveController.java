package com.juve.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.juve.entity.Player;
import com.juve.entity.PlayerDetail;
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
	
	@GetMapping("/showDetails")
		public String playerDetails(@RequestParam("detailId") int theId, @RequestParam("playerId") int theId2, Model theModel) {
		List<PlayerDetail> theDetail = playerService.getPlayerDetails(theId);
		List<Player> thePlayer = playerService.getPlayer(theId2);

		theModel.addAttribute("detail",theDetail);
		theModel.addAttribute("player",thePlayer);

		return "details-player";
		}
		

	
	
	
	
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("detailId") int theId,@RequestParam("playerId") int theId2,Model theModel) {
		List<PlayerDetail> theDetail = playerService.getPlayerDetails(theId);
		List<Player> thePlayer = playerService.getPlayer(theId2);
		theModel.addAttribute("detail",theDetail);
		theModel.addAttribute("player",thePlayer);
		return"update-details";
	}

}
