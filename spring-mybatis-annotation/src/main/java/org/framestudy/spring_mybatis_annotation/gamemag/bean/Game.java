package org.framestudy.spring_mybatis_annotation.gamemag.bean;

import java.io.Serializable;
import java.util.List;

public class Game implements Serializable{
	private Integer id;
	private String name;
	private List<Player> players;
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", players=" + players + "]";
	}
	
}
