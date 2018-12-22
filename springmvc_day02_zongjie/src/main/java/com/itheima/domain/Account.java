package com.itheima.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable {

    private String name;
    private String sex;

    private User user;

    private List<User> users;
    private Map<String,User> map;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", user=" + user +
                ", users=" + users +
                ", map=" + map +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }
}
