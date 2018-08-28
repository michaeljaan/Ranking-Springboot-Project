package in.com.cg.ranking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.com.cg.ranking.pojo.PlayerData;
import in.com.cg.ranking.service.TennisServiceImpl;

@SpringBootApplication
public class RankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RankingApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner loadInitialData(TennisServiceImpl service)
	{
		return (args)->{
			service.addNewPlayer(new PlayerData(1,"Rafa Nadal","SPN"));
			service.addNewPlayer(new PlayerData(2,"Roger Federer","SWI"));
			service.addNewPlayer(new PlayerData(3,"Jaun Del Potro","ARG"));
			service.addNewPlayer(new PlayerData(4,"Alexander zverev","GRM"));
			service.addNewPlayer(new PlayerData(5,"Kevin Anderson","USA"));
			service.addNewPlayer(new PlayerData(6,"Novak Djokovic","SRB"));
			service.addNewPlayer(new PlayerData(7,"Marin Cilic","CRO"));
			service.addNewPlayer(new PlayerData(8,"Grigor Dmitrov","BLG"));
			service.addNewPlayer(new PlayerData(9,"Dominic Thiem","DNM"));
			service.addNewPlayer(new PlayerData(10,"David Goffin","FRA"));
		};
	}
}
