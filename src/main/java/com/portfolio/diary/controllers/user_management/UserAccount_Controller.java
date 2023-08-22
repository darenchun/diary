package com.portfolio.diary.controllers.user_management;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.portfolio.diary.controllers.dto.UserInfo_DTO;

import lombok.extern.slf4j.Slf4j;

/**
 * SignIn controller class for APIs
 */

@Slf4j
@RestController
public class UserAccount_Controller {

    private final Gson gson = new Gson();

    @PostMapping(value = "/newUserAccount")
    public ResponseEntity<String> createAccount(@RequestBody UserInfo_DTO user) {
        // creating response
        String reqBody = gson.toJson(user);
        log.info("reqBody: {}", reqBody);

        

        
        return ResponseEntity.ok(reqBody);
    }

}