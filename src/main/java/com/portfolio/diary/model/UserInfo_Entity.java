package com.portfolio.diary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_ACCOUNT", schema = "portfolio_diary")
public class UserInfo_Entity {
    @Id
    int    user_pk;
    String user_id;
    String user_name;
    String user_ph;
    String user_email;
}
