package com.portfolio.diary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.diary.model.UserInfo_Entity;


public interface UserInfo_Repository extends JpaRepository<UserInfo_Entity, Integer> {
}
