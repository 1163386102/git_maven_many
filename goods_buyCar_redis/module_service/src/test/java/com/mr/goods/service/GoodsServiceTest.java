package com.mr.goods.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mr.goods.entity.Goods;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-common.xml","classpath:spring-base.xml"})
public class GoodsServiceTest {

	@Autowired
	private GoodsService userService;
	@Test
	public void userServiceTest(){
		Goods queryGoodsById = userService.queryGoodsById(1);
		System.out.println(queryGoodsById);
	}
}
