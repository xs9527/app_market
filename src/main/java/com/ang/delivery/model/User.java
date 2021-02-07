package com.ang.delivery.model;

import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @Description
 * @Date 2021/2/7
 * @Author yxs
 * @Version 1.0
 **/
@TableName("user")
public class User {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名称
     */
    private String username;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String password;
    /**
     * 偏移量 加密
     */
    private String salt;
    /**
     * 0、禁用 1、正常
     */
    private int statusType;

    private Date createTime;

    private Date modifyTime;

}
