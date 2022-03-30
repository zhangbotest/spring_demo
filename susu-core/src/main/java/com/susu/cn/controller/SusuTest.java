package com.susu.cn.controller;

import com.susu.cn.dao.ResultDto;
import com.susu.cn.dao.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SusuTest {
    @RequestMapping("/test")
    public ResultDto test(User user){
        ResultDto resultDto = new ResultDto();
        resultDto.setCode("200");
        resultDto.setMsg("susu");
        resultDto.setObject("susu");
        return resultDto;
    }
}
