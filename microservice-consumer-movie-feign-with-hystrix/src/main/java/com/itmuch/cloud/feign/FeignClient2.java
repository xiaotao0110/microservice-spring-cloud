package com.itmuch.cloud.feign;

import com.itmuch.configuration.Configuration2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="xxxx",url="http://localhost:8761/",configuration = Configuration2.class)
public interface FeignClient2 {

	@RequestMapping(value = "/eureka/apps/{serviceName}",method = RequestMethod.GET)
	public String findInfo(@PathVariable("serviceName") String serviceName);
}
