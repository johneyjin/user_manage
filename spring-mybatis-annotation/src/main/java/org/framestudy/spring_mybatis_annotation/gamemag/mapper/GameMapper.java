package org.framestudy.spring_mybatis_annotation.gamemag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.framestudy.spring_mybatis_annotation.gamemag.bean.Game;

public interface GameMapper {
	/**
	 * 查询所有游戏
	 * @return 返回游戏集合
	 */
	@Select("select * from game")
	@Results({
		@Result(id=true,property="id",javaType=Integer.class,column="id"),
		@Result(property="name",javaType=String.class,column="name")
	})
	public List<Game> findAllGames();
}
