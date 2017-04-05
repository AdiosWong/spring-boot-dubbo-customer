/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * xinqing@yiji.com 2017年4月5日 上午11:13:20 创建
 */

package com.xinqing.dubbo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.xinqing.dubbo.domain.City;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */

@Component
public class MyTimer {
	
	@Reference(version = "1.0")
	private CityService cityService;
	
	@Scheduled(fixedRate = 3000)
	public void timerRate() {
		City city = cityService.findCityByName("");
		String cityString = JSON.toJSONString(city);
		System.out.println(cityString);
	}
	
}
