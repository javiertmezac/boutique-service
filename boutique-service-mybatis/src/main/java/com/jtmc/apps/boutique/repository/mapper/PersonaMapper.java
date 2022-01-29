package com.jtmc.apps.boutique.repository.mapper;

import static com.jtmc.apps.boutique.repository.mapper.PersonaDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.jtmc.apps.boutique.domain.Persona;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import javax.annotation.processing.Generated;

@Mapper
public interface PersonaMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.236262-08:00", comments="Source Table: Persona")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, address, phone, email, registration, status);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.226335-08:00", comments="Source Table: Persona")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.227627-08:00", comments="Source Table: Persona")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.228024-08:00", comments="Source Table: Persona")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Persona> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.228607-08:00", comments="Source Table: Persona")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Persona> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.229121-08:00", comments="Source Table: Persona")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PersonaResult")
    Optional<Persona> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.229629-08:00", comments="Source Table: Persona")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PersonaResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="registration", property="registration", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.BIT)
    })
    List<Persona> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.231441-08:00", comments="Source Table: Persona")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.231768-08:00", comments="Source Table: Persona")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, persona, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.232066-08:00", comments="Source Table: Persona")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, persona, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.232465-08:00", comments="Source Table: Persona")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.232874-08:00", comments="Source Table: Persona")
    default int insert(Persona record) {
        return MyBatis3Utils.insert(this::insert, record, persona, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(address).toProperty("address")
            .map(phone).toProperty("phone")
            .map(email).toProperty("email")
            .map(registration).toProperty("registration")
            .map(status).toProperty("status")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.233833-08:00", comments="Source Table: Persona")
    default int insertMultiple(Collection<Persona> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, persona, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(address).toProperty("address")
            .map(phone).toProperty("phone")
            .map(email).toProperty("email")
            .map(registration).toProperty("registration")
            .map(status).toProperty("status")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.234339-08:00", comments="Source Table: Persona")
    default int insertSelective(Persona record) {
        return MyBatis3Utils.insert(this::insert, record, persona, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(registration).toPropertyWhenPresent("registration", record::getRegistration)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.237284-08:00", comments="Source Table: Persona")
    default Optional<Persona> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, persona, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.237661-08:00", comments="Source Table: Persona")
    default List<Persona> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, persona, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.237998-08:00", comments="Source Table: Persona")
    default List<Persona> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, persona, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.238494-08:00", comments="Source Table: Persona")
    default Optional<Persona> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.238827-08:00", comments="Source Table: Persona")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, persona, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.23917-08:00", comments="Source Table: Persona")
    static UpdateDSL<UpdateModel> updateAllColumns(Persona record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(address).equalTo(record::getAddress)
                .set(phone).equalTo(record::getPhone)
                .set(email).equalTo(record::getEmail)
                .set(registration).equalTo(record::getRegistration)
                .set(status).equalTo(record::getStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.239612-08:00", comments="Source Table: Persona")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Persona record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(registration).equalToWhenPresent(record::getRegistration)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.240356-08:00", comments="Source Table: Persona")
    default int updateByPrimaryKey(Persona record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(address).equalTo(record::getAddress)
            .set(phone).equalTo(record::getPhone)
            .set(email).equalTo(record::getEmail)
            .set(registration).equalTo(record::getRegistration)
            .set(status).equalTo(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-01-28T22:25:27.240849-08:00", comments="Source Table: Persona")
    default int updateByPrimaryKeySelective(Persona record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(email).equalToWhenPresent(record::getEmail)
            .set(registration).equalToWhenPresent(record::getRegistration)
            .set(status).equalToWhenPresent(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }
}