package in.com.cg.ranking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.com.cg.ranking.pojo.PlayerData;


@Repository
public interface TennisDAOInterface extends JpaRepository<PlayerData,Integer>{

}
