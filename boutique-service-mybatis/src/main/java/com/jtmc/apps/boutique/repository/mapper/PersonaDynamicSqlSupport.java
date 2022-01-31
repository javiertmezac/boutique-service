package com.jtmc.apps.boutique.repository.mapper;

import java.sql.JDBCType;
import java.time.Instant;
import javax.annotation.processing.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PersonaDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.224041-08:00", comments="Source Table: Persona")
    public static final Persona persona = new Persona();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.224568-08:00", comments="Source field: Persona.id")
    public static final SqlColumn<Integer> id = persona.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.225017-08:00", comments="Source field: Persona.name")
    public static final SqlColumn<String> name = persona.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.225141-08:00", comments="Source field: Persona.address")
    public static final SqlColumn<String> address = persona.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.225259-08:00", comments="Source field: Persona.phone")
    public static final SqlColumn<String> phone = persona.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.225387-08:00", comments="Source field: Persona.email")
    public static final SqlColumn<String> email = persona.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.225498-08:00", comments="Source field: Persona.registration")
    public static final SqlColumn<Instant> registration = persona.registration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.22559-08:00", comments="Source field: Persona.status")
    public static final SqlColumn<Boolean> status = persona.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.224334-08:00", comments="Source Table: Persona")
    public static final class Persona extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<Instant> registration = column("registration", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> status = column("status", JDBCType.BIT);

        public Persona() {
            super("Persona");
        }
    }
}