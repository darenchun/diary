package com.portfolio.diary.repository.userManagement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.diary.model.userManagement.UserInfo_Entity;


public interface UserInfo_Repository extends JpaRepository<UserInfo_Entity, Integer> {
    List<UserInfo_Entity> findByUserEmailOrUserPh(String user_email, String user_ph);
}
