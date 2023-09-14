package com.portfolio.diary.repository.articleManagement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.diary.model.articleManagement.DiaryArticle_Entity;

public interface DiaryArticle_Repository extends JpaRepository<DiaryArticle_Entity, Integer>{
    
}
