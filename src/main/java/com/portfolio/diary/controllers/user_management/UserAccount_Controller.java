package com.portfolio.diary.controllers.user_management;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.portfolio.diary.controllers.dto.UserInfo_DTO;
import com.portfolio.diary.model.userManagement.UserInfo_Entity;
import com.portfolio.diary.services.implementation.userManagement.UserAccount_SerImpl;

import lombok.extern.slf4j.Slf4j;

/**
 * SignIn controller class for APIs
 */

@Slf4j
@RestController
public class UserAccount_Controller {

    private final UserAccount_SerImpl userAccService;
    private final Gson gson = new Gson();

    public UserAccount_Controller(UserAccount_SerImpl userAccService) {
        this.userAccService = userAccService;
    }

    @PostMapping(value = "/newUserAccount")
    public ResponseEntity<String> createAccount(@RequestBody UserInfo_DTO user) {
        // setting dto to add flag for duplication.
        String reqBody = gson.toJson(user);
        // flag value for duplication. # default : false.
        boolean duplicate = false;
        // converting dto to json object to plant flag value in json object.
        JsonObject jsonObject = JsonParser.parseString(reqBody).getAsJsonObject();

        /* setting ready Entity for repo */
        UserInfo_Entity userEntity = new UserInfo_Entity();
        userEntity.setUserEmail(user.getUserEmail());
        userEntity.setUserId(user.getUserEmail());
        userEntity.setUserName(user.getUserName());
        userEntity.setUserPh(user.getUserPhoneNumber());
        userEntity.setUserPassword(user.getUserPassword());

        /* check for duplication */
        List<UserInfo_Entity> uListForDupCheck = userAccService.findByUserEmailOrUserPh(userEntity);

        /* duplicate check */
        if (uListForDupCheck.size() == 0) {
            log.info("중복이 아닙니다.");
            jsonObject.addProperty("duplication", duplicate); // adding flag.
            reqBody = gson.toJson(jsonObject);
            log.info("reqBody: {}", reqBody);
            /* call Service */
            userAccService.createUserInfo_Entity(userEntity);
        } else {
            /* log 중복 목록 확인 - 로그 확인용입니다.[시작] */
            // uListForDupCheck.forEach(
            // (UserInfo_Entity u) -> {
            // log.info("중복된 인원입니다." + u.getUserPk());
            // log.info(u.toString());
            // }
            // );
            /* log 중복 목록 확인 - 로그 확인용입니다.[끝] */
            duplicate = true;
            jsonObject.addProperty("duplication", duplicate); // adding flag.
            reqBody = gson.toJson(jsonObject);
        }
        return ResponseEntity.ok(reqBody);
    }

}