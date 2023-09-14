package com.portfolio.diary.controllers.diary_management;

import java.sql.Timestamp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.portfolio.diary.controllers.dto.ArticleInfo_DTO;
import com.portfolio.diary.model.articleManagement.DiaryArticle_Entity;
import com.portfolio.diary.model.userManagement.UserInfo_Entity;
import com.portfolio.diary.services.implementation.diaryManagement.DiaryManagement_SerImpl;
import com.portfolio.diary.services.implementation.userManagement.UserAccount_SerImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DiaryArticle_Controller {
    private final DiaryManagement_SerImpl diaryService;
    private final UserAccount_SerImpl userService;
    private final Gson gson = new Gson();

    public DiaryArticle_Controller(DiaryManagement_SerImpl diaryService, UserAccount_SerImpl userService) {
        this.diaryService = diaryService;
        this.userService = userService;
    }

    @PostMapping(value = "/newArticle", produces="text/plain;charset=UTF-8")
    public ResponseEntity<String> createNewArticle(@RequestBody ArticleInfo_DTO diaryContents) {
        /* logging post contetns */
        log.info("Request body" + diaryContents.toString() + "currentTimeMills" + System.currentTimeMillis());

        /* create / setting Entity */
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis()); // 연산 당시 시간
        UserInfo_Entity user = userService.getUserInfo_Entity(1); // 임시로 1번 회원 정보
        log.info("currentTimestamp" + currentTimestamp);

        /* build entity : DiaryArticle_Entity */
        DiaryArticle_Entity de = DiaryArticle_Entity.builder()
                .user_pk(user)
                .diary_contents(diaryContents.getDiaryArticle())
                .diary_creation_time(currentTimestamp)
                .diary_last_update_time(currentTimestamp)
                .build();

        /* calling service */
        log.info("Diary content Info : " + de.toString());
        try {
            DiaryArticle_Entity savedEntity = diaryService.createDiaryArticle_Entity(de);
                /* setting response */
                String reqBody = gson.toJson(savedEntity);
                log.info("Response Body" + reqBody.toString());
                return ResponseEntity.ok(reqBody);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
