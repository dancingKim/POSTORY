package com.jungsukcd2.postory.dao;


import com.jungsukcd2.postory.domain.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private SqlSession session;

    private static String namespace = "com.jungsukcd2.postory.dao.UserMapper.";

    public List<UserDto> getAllUser() {
        List<UserDto> list = session.selectList(namespace+"getAll");
        return list;
    }


}
