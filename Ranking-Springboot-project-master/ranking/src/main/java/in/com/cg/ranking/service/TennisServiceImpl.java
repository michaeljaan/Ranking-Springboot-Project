package in.com.cg.ranking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.com.cg.ranking.dao.TennisDAOInterface;
import in.com.cg.ranking.pojo.PlayerData;

@Service
public class TennisServiceImpl implements TennisServiceInterface{

	@Autowired
	private TennisDAOInterface dao;
	
	@Override
	public List<PlayerData> viewAllPlayers() {
		
		return dao.findAll();
	}

	@Override
	public void addNewPlayer(PlayerData player) {
		dao.save(player);
		
	}

	@Override
	public void deletePlayer(int rank) {
		dao.deleteById(rank);
		
	}

	@Override
	public Optional<PlayerData> getPlayer(int rank) {
		
		return dao.findById(rank);
	}

	@Override
	public void updatePlayer(PlayerData player, int rank) {
		dao.save(player);
		
	}

}
