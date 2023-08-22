package com.portfolio.diary.services.Interface;

import java.util.List;

import com.portfolio.diary.model.UserInfo_Entity;

public interface UserAccount_Service {
    List<UserInfo_Entity> getAllUserInfo_Entitys();
    UserInfo_Entity createUserInfo_Entity(UserInfo_Entity user);
    UserInfo_Entity getUserInfo_Entity(Integer id);
    UserInfo_Entity updateUserInfo_Entity(Integer id, UserInfo_Entity upUser);
    void deleteUserInfo_Entity(Integer id);    
}

