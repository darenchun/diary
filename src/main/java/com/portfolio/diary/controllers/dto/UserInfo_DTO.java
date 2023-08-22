package com.portfolio.diary.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserInfo_DTO {
    String userPk;
    String userName;
    String userEmail;
    String userPhoneNumber;
    String userPassword;
}
