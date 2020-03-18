package com.springlearn.demo.beans;

/**
 * 序号${}
 *
 * @author menggy
 * @date 2020/3/18 17:19
 */
public class SimpleBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name ;

    public static SimpleBean factoryCreateBean() {
       SimpleBean simpleBean= new SimpleBean();
        simpleBean.setName("dddd");
        return simpleBean;
    }

}
