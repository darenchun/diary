package com.portfolio.diary.services.implementation.diaryManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.diary.model.articleManagement.DiaryArticleFile_Entity;
import com.portfolio.diary.model.articleManagement.DiaryArticle_Entity;
import com.portfolio.diary.repository.articleManagement.DiaryArticleFile_Repository;
import com.portfolio.diary.repository.articleManagement.DiaryArticle_Repository;
import com.portfolio.diary.services.Interface.diaryManagement.DiaryManagement_Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class DiaryManagement_SerImpl implements DiaryManagement_Service {
    @Autowired
    private final DiaryArticle_Repository diaryArticle_Repository;

    @Autowired
    private final DiaryArticleFile_Repository diaryFile_Repository;

    @Override
    public List<DiaryArticle_Entity> createDiaryArticleFiles_Entity(DiaryArticleFile_Entity files) {
        return null;
    }

    @Override
    public DiaryArticle_Entity createDiaryArticle_Entity(DiaryArticle_Entity diary) {

        DiaryArticle_Entity de = diaryArticle_Repository.save(diary);
        log.info("saved article :" + de.toString());
        return de;
    }

}
