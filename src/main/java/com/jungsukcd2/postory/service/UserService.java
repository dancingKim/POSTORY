package com.jungsukcd2.postory.service;

import com.jungsukcd2.postory.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao UserDao;

    @Autowired
    public UserService(UserDao UserDao){
        this.UserDao = UserDao;
    }

    public List<UserDto> getUsers() {
        return UserDao.getUsers();
    }
}
