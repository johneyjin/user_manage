package org.framestudy.spring_mybatis_annotation.gamemag.bean;

import java.io.Serializable;
import java.util.List;


public class Player implements Serializable {
	private Integer id;
	private String name;
	private List<Game> games;
	public Player() {
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
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", games=" + games + "]";
	}
}
