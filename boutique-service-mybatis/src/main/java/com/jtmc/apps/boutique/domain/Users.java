package com.jtmc.apps.boutique.domain;

import javax.annotation.processing.Generated;
import java.time.Instant;

public class Users {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242482-08:00", comments="Source field: Users.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242614-08:00", comments="Source field: Users.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242719-08:00", comments="Source field: Users.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242841-08:00", comments="Source field: Users.registration")
    private Instant registration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242966-08:00", comments="Source field: Users.status")
    private Boolean status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.24307-08:00", comments="Source field: Users.personaId")
    private Integer personaid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242539-08:00", comments="Source field: Users.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.24258-08:00", comments="Source field: Users.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242649-08:00", comments="Source field: Users.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242688-08:00", comments="Source field: Users.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242754-08:00", comments="Source field: Users.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242803-08:00", comments="Source field: Users.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242883-08:00", comments="Source field: Users.registration")
    public Instant getRegistration() {
        return registration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.242932-08:00", comments="Source field: Users.registration")
    public void setRegistration(Instant registration) {
        this.registration = registration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243002-08:00", comments="Source field: Users.status")
    public Boolean getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243038-08:00", comments="Source field: Users.status")
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243105-08:00", comments="Source field: Users.personaId")
    public Integer getPersonaid() {
        return personaid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243142-08:00", comments="Source field: Users.personaId")
    public void setPersonaid(Integer personaid) {
        this.personaid = personaid;
    }
}