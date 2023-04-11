package com.example.test.two;

public class Player {
	private String Name;
	private int Score;
	private String Type;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, int score, String type) {
		super();
		Name = name;
		Score = score;
		Type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@Override
	public String toString() {
		return "Player [Name=" + Name + ", Score=" + Score + ", Type=" + Type + "]";
	}

}
