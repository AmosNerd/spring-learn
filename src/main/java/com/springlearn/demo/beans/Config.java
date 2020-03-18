package com.springlearn.demo.beans;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 序号${}
 *
 * @author menggy
 * @date 2020/3/18 17:11
 */
@Component
public class Config {
    @Resource(name = "simpleBean")
    public SimpleBean simpleBean;
    @Resource(name = "simpleBean2")
    public SimpleBean simpleBean2;


}
