package com.jtmc.apps.boutique.domain;

import java.time.Instant;
import javax.annotation.processing.Generated;

public class Persona {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.216277-08:00", comments="Source field: Persona.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219412-08:00", comments="Source field: Persona.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219612-08:00", comments="Source field: Persona.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219765-08:00", comments="Source field: Persona.phone")
    private String phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219931-08:00", comments="Source field: Persona.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.220099-08:00", comments="Source field: Persona.registration")
    private Instant registration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.220384-08:00", comments="Source field: Persona.status")
    private Boolean status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219029-08:00", comments="Source field: Persona.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219344-08:00", comments="Source field: Persona.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219472-08:00", comments="Source field: Persona.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219561-08:00", comments="Source field: Persona.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219663-08:00", comments="Source field: Persona.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219717-08:00", comments="Source field: Persona.address")
    public void setAddress(String address) {
        this.address = address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219817-08:00", comments="Source field: Persona.phone")
    public String getPhone() {
        return phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219883-08:00", comments="Source field: Persona.phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.219981-08:00", comments="Source field: Persona.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.220045-08:00", comments="Source field: Persona.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.220184-08:00", comments="Source field: Persona.registration")
    public Instant getRegistration() {
        return registration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.220239-08:00", comments="Source field: Persona.registration")
    public void setRegistration(Instant registration) {
        this.registration = registration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.220454-08:00", comments="Source field: Persona.status")
    public Boolean getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.220508-08:00", comments="Source field: Persona.status")
    public void setStatus(Boolean status) {
        this.status = status;
    }
}