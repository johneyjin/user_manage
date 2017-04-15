package org.framestudy.spring_mybatis_annotation.gamemag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis_annotation.gamemag.bean.Game;
import org.framestudy.spring_mybatis_annotation.gamemag.dao.IGameDao;
import org.framestudy.spring_mybatis_annotation.gamemag.mapper.GameMapper;
import org.springframework.stereotype.Component;
@Component
public class GameDaoImpl implements IGameDao {
	
	@Resource
	private GameMapper gm;
	
	public List<Game> findAllGames() {
		// TODO Auto-generated method stub
		return gm.findAllGames();
	}

}
