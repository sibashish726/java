package com.example.test.two;

import java.util.*;
import java.util.stream.Collectors;

public class Team {
	private List<Player> players;
      
	public int getScore() {
		if(players!=null) {
			return players.stream().mapToInt(player -> player.getScore()).reduce(0, (a,b) -> a+b);
		}
		return 0;
		
	}
	
	public Map<String ,List<Player>> getPlayerBySkillSet(){
		Map<String ,List<Player>> setOfPlayers= players.stream().collect(Collectors.groupingBy(Player::getType));
		return setOfPlayers;
	} 
	
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
