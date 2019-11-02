package com.itmuch.cloud;


import com.itmuch.cloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;


	@GetMapping("/movie/{id}")
	@HystrixCommand(fallbackMethod = "findByIdFallback")
	public User findById(@PathVariable Long id){
		return restTemplate.getForObject("http://microservice-consumer-user/simple/"+id, User.class);
	}

	public User findByIdFallback(Long id){
		User user = new User();
		user.setId(0L);
		return user;
	}
}
