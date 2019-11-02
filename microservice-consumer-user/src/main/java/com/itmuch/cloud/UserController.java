package com.itmuch.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.entity.UserRepository;
import com.netflix.discovery.EurekaClient;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EurekaClient eurekaClient;
	
	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id){
		System.out.println(userRepository.getOne(id));
		return userRepository.getOne(id);
	}
	
	@GetMapping("/erueka-init")
	public String serverUrl(){

		return eurekaClient
				.getNextServerFromEureka("USER", false)
				.getHomePageUrl();
	}
	
	@PostMapping("/users")
	public User postUser(@RequestBody User user){
		
		return user;
	}
}
