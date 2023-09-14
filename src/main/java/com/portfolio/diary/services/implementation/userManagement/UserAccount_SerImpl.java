package com.portfolio.diary.services.implementation.userManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.diary.model.userManagement.UserInfo_Entity;
import com.portfolio.diary.repository.userManagement.UserInfo_Repository;
import com.portfolio.diary.services.Interface.userManagement.UserAccount_Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserAccount_SerImpl implements UserAccount_Service {

    @Autowired
    private final UserInfo_Repository userInfo_Repository;

    @Override
    public UserInfo_Entity createUserInfo_Entity(UserInfo_Entity user) {
        log.info("createUserInfo_Entity : {}", user.toString());
        return userInfo_Repository.save(user);
    }

    @Override
    public void deleteUserInfo_Entity(int id) {
        log.info("createUserInfo_Entity : {}", id);
        userInfo_Repository.deleteById(id);
    }

    @Override
    public List<UserInfo_Entity> getAllUserInfo_Entity() {
        List<UserInfo_Entity> list = userInfo_Repository.findAll();
        log.info("getAllUserInfo_Entitys : {}", list.toString());
        return list;
    }

    @Override
    public UserInfo_Entity getUserInfo_Entity(int id) {
        UserInfo_Entity user = userInfo_Repository.findById(id).get();
        log.info("getUserInfo_Entity : {}", user.toString());
        return user;
    }

    @Override
    public UserInfo_Entity updateUserInfo_Entity(int id, UserInfo_Entity upUser) {
        log.info("updateUserInfo_Entity : {} // ", upUser.toString());
        return userInfo_Repository.save(upUser);
    }

    @Override
    public List<UserInfo_Entity> findByUserEmailOrUserPh(UserInfo_Entity user) {
        log.info("getDuplicateUserInfo_Entity : {}");
        try {
            return userInfo_Repository.findByUserEmailOrUserPh(user.getUserEmail(), user.getUserPh());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
