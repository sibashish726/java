package com.example.test.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Player p1= new Player("Sibashish",50,"Batsman");
       Player p2= new Player("Shivam",58,"Batsman");
       Player p3= new Player("Ashish",13,"Bowler");
       
       
       List<Player> players= new ArrayList<Player>();
       players.add(p1);
       players.add(p2);
       players.add(p3);
       
       //System.out.println(players);
       Team team1= new Team();
       team1.setPlayers(players);
       
       System.out.println("Total Score -> "+ team1.getScore());
       System.out.println("*****Print player by skillset******");
       //Map<String , List<Player>> playerSet=team1.getPlayerBySkillSet() ;
       System.out.println(team1.getPlayerBySkillSet());
       
	}

}
