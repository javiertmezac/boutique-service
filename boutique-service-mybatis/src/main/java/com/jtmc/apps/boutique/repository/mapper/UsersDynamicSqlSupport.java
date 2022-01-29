package com.jtmc.apps.boutique.repository.mapper;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.processing.Generated;
import java.sql.JDBCType;
import java.time.Instant;

public final class UsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243227-08:00", comments="Source Table: Users")
    public static final Users users = new Users();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243411-08:00", comments="Source field: Users.id")
    public static final SqlColumn<Integer> id = users.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243485-08:00", comments="Source field: Users.username")
    public static final SqlColumn<String> username = users.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243566-08:00", comments="Source field: Users.password")
    public static final SqlColumn<String> password = users.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.24365-08:00", comments="Source field: Users.registration")
    public static final SqlColumn<Instant> registration = users.registration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.24372-08:00", comments="Source field: Users.status")
    public static final SqlColumn<Boolean> status = users.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243806-08:00", comments="Source field: Users.personaId")
    public static final SqlColumn<Integer> personaid = users.personaid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.243333-08:00", comments="Source Table: Users")
    public static final class Users extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Instant> registration = column("registration", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> status = column("status", JDBCType.BIT);

        public final SqlColumn<Integer> personaid = column("personaId", JDBCType.INTEGER);

        public Users() {
            super("Users");
        }
    }
}