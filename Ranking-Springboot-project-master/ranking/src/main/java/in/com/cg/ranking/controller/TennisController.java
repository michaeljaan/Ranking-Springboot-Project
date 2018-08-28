package in.com.cg.ranking.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.com.cg.ranking.pojo.PlayerData;
import in.com.cg.ranking.service.TennisServiceImpl;

@RestController
public class TennisController {
	
	@Autowired
	private TennisServiceImpl service;
	
	@RequestMapping("/ranking")
	public List<PlayerData> viewAllPlayers() {
		
		return service.viewAllPlayers();
	}

	@RequestMapping(value = "/ranking", method = RequestMethod.POST)
	public void addNewPlayer(PlayerData player) {
		service.addNewPlayer(player);
		
	}

	@RequestMapping(value = "/ranking/{rank}", method = RequestMethod.DELETE)
	public void deletePlayer(int rank) {
		service.deletePlayer(rank);
		
	}

	@RequestMapping("/ranking/{rank}")
	public Optional<PlayerData> getPlayer(int rank) {
		return service.getPlayer(rank);
	}

	@RequestMapping(value = "/ranking/{rank}", method = RequestMethod.PUT)
	public void updatePlayer(PlayerData player, int rank) {
		service.updatePlayer(player, rank);
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(method=RequestMethod.GET, value="/ranking/{start}/{count}")
	public Resources getByRank(@PathVariable int start, @PathVariable int count)
	{
		List<PlayerData> tempPlayer= service.viewAllPlayers();
		List<PlayerData> player=new ArrayList();
		for(int i=start;i<start+count;i++)
		{
			player.add(tempPlayer.get(i));
		}
		Link nextLink = linkTo(methodOn(this.getClass()).getByRank(start+count, count)).withRel("Next Link");
		Link previousLink = linkTo(methodOn(this.getClass()).getByRank(start+count<=0?start-count:1, count)).withRel("Prevoius Link");
		
		return new Resources(player,nextLink,previousLink);
	}


}
