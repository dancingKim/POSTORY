package com.jungsukcd2.postory.service;

import com.jungsukcd2.postory.dao.*;
import com.jungsukcd2.postory.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private UserDao userDao;

    public List<UserDto> getAllUser() {
        return userDao.getAllUser();
    }


}
