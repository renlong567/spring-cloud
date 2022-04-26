package com.example.sentinelservice.service;

import com.example.sentinelservice.service.impl.UserFallbackService;
import com.example.springcloud.common.api.CommonResult;
import com.example.springcloud.model.UmsMember;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "nacos-user-service",fallback = UserFallbackService.class)
public interface UserService {
    @PostMapping("/user/create")
    CommonResult create(@RequestBody UmsMember user);

    @GetMapping("/user/{id}")
    CommonResult<UmsMember> getUser(@PathVariable Long id);

    @GetMapping("/user/getByUsername")
    CommonResult<UmsMember> getByUsername(@RequestParam String username);

    @PostMapping("/user/update")
    CommonResult update(@RequestBody UmsMember user);

    @PostMapping("/user/delete/{id}")
    CommonResult delete(@PathVariable Long id);
}
