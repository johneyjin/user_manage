package org.framestudy.spring_mybatis_annotation.gamemag.service;

import java.util.List;

import org.framestudy.spring_mybatis_annotation.gamemag.bean.Game;

public interface IGameService {
	/**
	 * 查询所有游戏
	 * @return 返回游戏集合
	 */
	public List<Game> findAllGames();
}
