package com.portfolio.diary.services.Interface.diaryManagement;

import java.util.List;
import java.util.Optional;

import com.portfolio.diary.model.articleManagement.DiaryArticleFile_Entity;
import com.portfolio.diary.model.articleManagement.DiaryArticle_Entity;

public interface DiaryManagement_Service {
    /* creating one article */
    DiaryArticle_Entity createDiaryArticle_Entity(DiaryArticle_Entity diary);
    /* creating one article realted files */
    List<DiaryArticle_Entity> createDiaryArticleFiles_Entity(DiaryArticleFile_Entity files);
    /* retrieveing one article via pk*/
    Optional<DiaryArticle_Entity> getOneArticle_Entity(int diary_pk);
}
