package org.framestudy.spring_mybatis_annotation.gamemag.dao;

import java.util.List;

import org.framestudy.spring_mybatis_annotation.gamemag.bean.Game;

public interface IGameDao {
	/**
	 * 查询所有游戏
	 * @return 返回游戏集合
	 */
	public List<Game> findAllGames();
}
