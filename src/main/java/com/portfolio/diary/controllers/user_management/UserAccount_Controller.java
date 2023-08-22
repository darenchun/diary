package com.portfolio.diary.controllers.user_management;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.portfolio.diary.controllers.dto.UserInfo_DTO;
import com.portfolio.diary.model.UserInfo_Entity;
import com.portfolio.diary.services.implementation.UserAccount_SerImpl;

import lombok.extern.slf4j.Slf4j;

/**
 * SignIn controller class for APIs
 */

@Slf4j
@RestController
public class UserAccount_Controller {
    
    private final UserAccount_SerImpl userAccService;
    private final Gson gson = new Gson();

    public UserAccount_Controller (UserAccount_SerImpl userAccService) {
        this.userAccService = userAccService;
    }

    @PostMapping(value = "/newUserAccount")
    public ResponseEntity<String> createAccount(@RequestBody UserInfo_DTO user) {
        // creating response
        String reqBody = gson.toJson(user);
        log.info("reqBody: {}", reqBody);

        /* setting Entity for repo */
        UserInfo_Entity userEntity = new UserInfo_Entity();
        userEntity.setUser_email(user.getUserEmail());
        userEntity.setUser_id(user.getUserEmail());
        userEntity.setUser_name(user.getUserName());
        userEntity.setUser_ph(user.getUserPhoneNumber());
        userEntity.setUser_password(user.getUserPassword());

        /* call Service */
        userAccService.createUserInfo_Entity(userEntity);
        
        return ResponseEntity.ok(reqBody);
    }

}