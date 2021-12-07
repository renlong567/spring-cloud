package com.example.springcloud.hystrixservice.service;

import com.example.springcloud.common.api.CommonResult;
import com.example.springcloud.model.UmsMember;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @HystrixCommand(fallbackMethod = "getDefaultUser")
    public CommonResult  getUser(Long id) {
        return restTemplate.getForObject(userServiceUrl + "/user/{1}", CommonResult.class, id);
    }

    public CommonResult getDefaultUser(@PathVariable Long id) {
        UmsMember defaultUser = new UmsMember();
        defaultUser.setId(-1L);
        defaultUser.setUsername("defaultUser");
        return CommonResult.success(defaultUser);
    }
}