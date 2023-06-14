package com.jungsukcd2.postory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String userId;
    private String eid;
    private String pwd;

    private String nic;
    private String userIntro;
    private java.util.Date userImgPath;
    private String singupDtm;
    private String holdPnt;
    private String msgAllowYn;
}

