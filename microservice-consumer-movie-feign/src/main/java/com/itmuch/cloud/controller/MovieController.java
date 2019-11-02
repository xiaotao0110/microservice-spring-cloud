package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.feign.FeignClient2;
import com.itmuch.cloud.feign.UserFeignClient;
import com.itmuch.cloud.entity.User;

@RestController
public class MovieController {

	@Autowired
	private UserFeignClient userFeignClient;

	@Autowired
	private FeignClient2 feignClient2;

	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id){
		return userFeignClient.findById(id);
	}
	
	@GetMapping("/test")
	public User test(User user){
		return userFeignClient.postUser(user);
	}
	
	@GetMapping("/{serviceName}")
	public String findInfo(@PathVariable String serviceName){
		return feignClient2.findInfo(serviceName);
	}
}
