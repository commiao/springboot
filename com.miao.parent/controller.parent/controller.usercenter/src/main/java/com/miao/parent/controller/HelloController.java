package com.miao.parent.controller;

import com.miao.parent.basic.business.entity.BoyProperties;
import com.miao.parent.basic.business.entity.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jingmiao on 2017/12/18.
 */
//等同于同时加上了@Controller和@ResponseBody
@Controller
public class HelloController {

    @Autowired
    private BoyProperties boy;

    @Autowired
    private Properties property;

    @Value("${boy.name}")
    private String name;

    //访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    @ResponseBody
    public String say(){
        System.out.println("name:"+boy.getName()+",age:"+property.getAge()+",name:"+name);
        return "hi you!!!";
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
