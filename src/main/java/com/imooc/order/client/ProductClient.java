package com.imooc.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName ProductClient
 * @Description TODO
 * @Author hxh
 * @Date 2020/5/13 10:20 下午
 * @Version 1.0
 */
@FeignClient(name = "product")
public interface ProductClient {
    @GetMapping("/msg")
    String productMsg();
}
