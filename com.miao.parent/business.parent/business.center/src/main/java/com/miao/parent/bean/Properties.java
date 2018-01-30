package com.miao.parent.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jingmiao on 2017/12/19.
 */
@Component
public class Properties {

    @Value("${boy.age}")
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
