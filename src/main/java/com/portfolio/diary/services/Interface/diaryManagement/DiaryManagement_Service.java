package com.portfolio.diary.services.Interface.diaryManagement;

import java.util.List;

import com.portfolio.diary.model.articleManagement.DiaryArticleFile_Entity;
import com.portfolio.diary.model.articleManagement.DiaryArticle_Entity;

public interface DiaryManagement_Service {
    DiaryArticle_Entity createDiaryArticle_Entity(DiaryArticle_Entity diary);
    List<DiaryArticle_Entity> createDiaryArticleFiles_Entity(DiaryArticleFile_Entity files);
}
