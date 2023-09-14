package com.portfolio.diary.repository.articleManagement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.diary.model.articleManagement.DiaryArticleFile_Entity;

public interface DiaryArticleFile_Repository extends JpaRepository<DiaryArticleFile_Entity, Integer>{
    
}
