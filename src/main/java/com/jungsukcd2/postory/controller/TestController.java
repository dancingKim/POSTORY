package com.jungsukcd2.postory.controller;

import com.jungsukcd2.postory.domain.*;
import com.jungsukcd2.postory.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/user")
    public List<UserDto> getAllUser() {
        return testService.getAllUser();
    }

}
