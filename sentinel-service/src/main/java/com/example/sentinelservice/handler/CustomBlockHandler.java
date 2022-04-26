package com.example.sentinelservice.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.springcloud.common.api.CommonResult;

public class CustomBlockHandler {

    public CommonResult handleException(BlockException exception) {
        return CommonResult.success(true, "自定义限流信息");
    }
}