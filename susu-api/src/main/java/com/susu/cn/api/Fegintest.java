package com.susu.cn.api;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/testFegin")
public interface Fegintest {
    @RequestMapping("/testFegin")
    public  String  test();
}
