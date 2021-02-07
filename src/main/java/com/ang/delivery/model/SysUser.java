package com.ang.delivery.model;

import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @Description
 * @Date 2021/2/7
 * @Author yxs
 * @Version 1.0
 **/
@TableName("sys_user")
public class SysUser {

    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 偏移量
     */
    private String salt;
    private int age;
    private int type;
    private Date ctime;

    public Long getId() {
        return id;
    }

    public SysUser setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public SysUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassWord() {
        return passWord;
    }

    public SysUser setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public SysUser setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public SysUser setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public int getAge() {
        return age;
    }

    public SysUser setAge(int age) {
        this.age = age;
        return this;
    }

    public int getType() {
        return type;
    }

    public SysUser setType(int type) {
        this.type = type;
        return this;
    }

    public Date getCtime() {
        return ctime;
    }

    public SysUser setCtime(Date ctime) {
        this.ctime = ctime;
        return this;
    }
}
