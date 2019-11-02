package com.itmuch.cloud.controller;

import com.itmuch.cloud.feign.FeignClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import com.itmuch.cloud.feign.UserFeignClient;
import com.itmuch.cloud.entity.User;

import javax.annotation.Resource;

@RestController
public class MovieController {

	@Autowired
	private UserFeignClient userFeignClient;

	@Autowired
	private FeignClient2 feignClient2;

	@RequestMapping(value = "/movie/{id}" ,method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id){
		return userFeignClient.findById(id);
	}

	@GetMapping("/{serviceName}")
	public String findInfo(@PathVariable String serviceName){
		return feignClient2.findInfo(serviceName);
	}

}
