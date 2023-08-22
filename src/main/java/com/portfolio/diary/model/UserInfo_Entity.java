package com.portfolio.diary.model;

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
    int    user_pk;
    String user_id;
    String user_name;
    String user_ph;
    String user_email;
    String user_password;

}
