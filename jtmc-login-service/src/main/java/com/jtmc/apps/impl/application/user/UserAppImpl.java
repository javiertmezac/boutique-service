package com.jtmc.apps.impl.application.user;

import com.google.inject.Inject;
import com.jtmc.apps.impl.domain.Users;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import javax.naming.OperationNotSupportedException;
import java.util.Optional;

import static org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils.select;

public class UserAppImpl {
    @Inject
    private SqlSessionFactory sqlSessionFactory;

    public Optional<Users> selectUser(String inputUsername, String inputPassword) {

        throw new UnsupportedOperationException("Not ready yet");

//        try(SqlSession session = sqlSessionFactory.openSession()) {
//            UsersMapper mapper = session.getMapper(UsersMapper.class);
//            SelectStatementProvider statementProvider =
//                    select(UsersMapper.selectList, users,
//                            c -> c.where(username, isEqualTo(inputUsername))
//                                    .and(password, isEqualTo(inputPassword))
//                    );
//
//            return mapper.selectOne(statementProvider);
//        }
    }
}
