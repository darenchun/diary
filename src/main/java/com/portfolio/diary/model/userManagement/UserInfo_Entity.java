package com.portfolio.diary.model.userManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_ACCOUNT", schema = "portfolio_diary")
public class UserInfo_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indicates auto-increment
    @Column(name = "user_pk",nullable = false)
    private Integer    userPk;
    @Column(name = "user_id",nullable = false)
    private String userId;
    @Column(name = "user_name",nullable = false)
    private String userName;
    @Column(name = "user_ph",nullable = false)
    private String userPh;
    @Column(name = "user_email",nullable = false)
    private String userEmail;
    @Column(name = "user_password",nullable = false)
    private String userPassword;

}
