package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: aster
 * @createDate: 2019/6/21
 */
@RestController
public class HelloControlller {

   @Autowired
   private LimitConfig limitConfig;

    @GetMapping("/hello")
    public String say(){
        String say="";
        return "说明："+limitConfig.getDescription();
    }
}
