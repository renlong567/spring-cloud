package com.example.feignservice.service.impl;

import com.example.feignservice.service.UserService;
import com.example.springcloud.common.api.CommonResult;
import com.example.springcloud.model.UmsMember;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackService implements UserService {
    @Override
    public CommonResult create(UmsMember user) {
        UmsMember defaultUser = new UmsMember();
        defaultUser.setId(-1L);
        defaultUser.setUsername("defaultUser");
        defaultUser.setPassword("123456");
        return CommonResult.success(defaultUser);
    }

    @Override
    public CommonResult<UmsMember> getUser(Long id) {
        UmsMember defaultUser = new UmsMember();
        defaultUser.setId(-1L);
        defaultUser.setUsername("defaultUser");
        defaultUser.setPassword("123456");
        return CommonResult.success(defaultUser);
    }

    @Override
    public CommonResult<UmsMember> getByUsername(String username) {
        UmsMember defaultUser = new UmsMember();
        defaultUser.setId(-1L);
        defaultUser.setUsername("defaultUser");
        defaultUser.setPassword("123456");
        return CommonResult.success(defaultUser);
    }

    @Override
    public CommonResult update(UmsMember user) {
        return CommonResult.failed("调用失败，服务被降级");
    }

    @Override
    public CommonResult delete(Long id) {
        return CommonResult.failed("调用失败，服务被降级");
    }
}
