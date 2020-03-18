package com.springlearn.demo.beans;

import org.springframework.stereotype.Component;

/**
 * 序号${}
 *
 * @author menggy
 * @date 2020/3/18 17:53
 */
@Component
public class Service {
    private final Config config;

    public Service(Config config) {
        this.config = config;
        //通过构造方法产生的bean的name=null
        System.out.println(config.simpleBean.getName());
        //通过静态方法产生的bean的name有值
        System.out.println(config.simpleBean2.getName());

    }
}
