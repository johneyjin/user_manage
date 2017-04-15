package org.framestudy.spring_mybatis_annotation.gamemag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis_annotation.gamemag.bean.Game;
import org.framestudy.spring_mybatis_annotation.gamemag.dao.IGameDao;
import org.framestudy.spring_mybatis_annotation.gamemag.service.IGameService;
import org.springframework.stereotype.Service;
@Service
public class GameServiceImpl implements IGameService {
	
	@Resource
	private IGameDao gameDaoImpl;

	public List<Game> findAllGames() {
		// TODO Auto-generated method stub
		return gameDaoImpl.findAllGames();
	}

}
