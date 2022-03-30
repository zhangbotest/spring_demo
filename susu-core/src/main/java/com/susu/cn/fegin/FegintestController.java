package com.susu.cn.fegin;

import com.susu.cn.api.Fegintest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FegintestController implements Fegintest {
    @Override
    public String test() {
        return  "haha";
    }
}
