package com.jtmc.apps.boutique.repository;

import com.google.inject.Inject;
import com.jtmc.apps.boutique.domain.Users;
import com.jtmc.apps.boutique.repository.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import java.util.Optional;

import static com.jtmc.apps.boutique.repository.mapper.UsersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils.select;

public class UserRepositoryImpl {

    @Inject
    private SqlSessionFactory sqlSessionFactory;

    public Optional<Users> selectUser(String inputUsername, String inputPassword){
        try(SqlSession session = sqlSessionFactory.openSession()) {
            UsersMapper mapper = session.getMapper(UsersMapper.class);
            SelectStatementProvider statementProvider =
                    select(UsersMapper.selectList, users,
                            c -> c.where(username, isEqualTo(inputUsername))
                                    .and(password, isEqualTo(inputPassword))
                    );

            return mapper.selectOne(statementProvider);
        }
    }
}
