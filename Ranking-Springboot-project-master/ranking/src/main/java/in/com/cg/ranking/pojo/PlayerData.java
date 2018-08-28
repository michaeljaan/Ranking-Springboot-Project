package in.com.cg.ranking.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerData {
	
	@Id
	private int ranking;
	private String name;
	private String country;
	public PlayerData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerData(int ranking, String name, String country) {
		super();
		this.ranking = ranking;
		this.name = name;
		this.country = country;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
