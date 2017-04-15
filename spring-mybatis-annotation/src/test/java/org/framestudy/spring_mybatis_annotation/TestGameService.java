package org.framestudy.spring_mybatis_annotation;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis_annotation.gamemag.bean.Game;
import org.framestudy.spring_mybatis_annotation.gamemag.service.IGameService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:applicationContext.xml")
public class TestGameService {
	@Resource
	private IGameService gameServiceImpl;
	
	@Test
	public void testFindAllGames(){
		List<Game> games=gameServiceImpl.findAllGames();
		Assert.assertNotNull(games);
		for (Game game : games) {
			System.out.println(game);
		}
	}
}
