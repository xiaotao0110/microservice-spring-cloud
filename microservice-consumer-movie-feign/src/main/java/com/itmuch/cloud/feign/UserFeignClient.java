package com.itmuch.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itmuch.configuration.Configuration1;
import com.itmuch.cloud.entity.User;

@FeignClient(name = "microservice-consumer-user",configuration = Configuration1.class )
public interface UserFeignClient {
	
	@RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id);

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User postUser(@RequestBody User user);
}
   