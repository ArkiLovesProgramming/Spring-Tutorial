package com.arki;

import com.arki.dao.UserMapper;
import com.arki.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUser("1");
        System.out.println(user);
        session.close();
    }
}
