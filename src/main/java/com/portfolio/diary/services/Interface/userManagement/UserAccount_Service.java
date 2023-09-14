package com.portfolio.diary.services.Interface.userManagement;

import java.util.List;

import com.portfolio.diary.model.userManagement.UserInfo_Entity;

public interface UserAccount_Service {

    List<UserInfo_Entity> getAllUserInfo_Entity();

    UserInfo_Entity createUserInfo_Entity(UserInfo_Entity user);

    UserInfo_Entity getUserInfo_Entity(int id);

    UserInfo_Entity updateUserInfo_Entity(int id, UserInfo_Entity upUser);

    void deleteUserInfo_Entity(int id);

    List<UserInfo_Entity> findByUserEmailOrUserPh(UserInfo_Entity user);
}
