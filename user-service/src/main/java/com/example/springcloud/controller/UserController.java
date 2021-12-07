package com.example.springcloud.controller;

import com.example.springcloud.common.api.CommonResult;
import com.example.springcloud.model.UmsMember;
import com.example.springcloud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by macro on 2019/8/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public CommonResult<UmsMember> getUser(@PathVariable Long id) {
        UmsMember user = userService.getUser(id);
        LOGGER.info("根据id获取用户信息，用户名称为：{}", user.getUsername());
        return CommonResult.success(user);
    }
}
