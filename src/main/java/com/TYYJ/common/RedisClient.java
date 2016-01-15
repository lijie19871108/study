package com.TYYJ.common;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;

@Component
public class RedisClient {
	
	public Jedis jedis = null;
	
	public Jedis getClient(){
		if(jedis == null){
			jedis = new Jedis(Constant.HOST, Constant.PORT);
		}
		return jedis;
	}
	
}
