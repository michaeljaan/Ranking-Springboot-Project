package in.com.cg.ranking.service;

import java.util.List;
import java.util.Optional;

import in.com.cg.ranking.pojo.PlayerData;

public interface TennisServiceInterface {
	
	public List<PlayerData> viewAllPlayers();
	
	public void addNewPlayer(PlayerData player);
	
	public void deletePlayer(int rank);
	
	public Optional<PlayerData> getPlayer(int rank);
	
	public void updatePlayer(PlayerData player, int rank);
	

}
