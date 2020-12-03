package com.bzzn.dynamicdatasource.entity;

import java.io.Serializable;

/**
 * (SysTest)实体类
 *
 * @author makejava
 * @since 2020-12-03 13:52:03
 */
public class SysTest implements Serializable {
    private static final long serialVersionUID = 609714287626485957L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 名称
    */
    private String name;
    /**
    * 年龄
    */
    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}