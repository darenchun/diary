package com.portfolio.diary.model.articleManagement;

import java.sql.Timestamp;

import com.portfolio.diary.model.userManagement.UserInfo_Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "DIARY_ARTICLE", schema = "portfolio_diary")
public class DiaryArticle_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diary_article_pk", nullable = false)
    private Integer diary_article_pk;
    @ManyToOne
    @JoinColumn(name = "user_pk")
    private UserInfo_Entity user_pk;
    @Column(name = "diary_contents", nullable = true)
    private String diary_contents;
    @Column(name = "diary_creation_time", nullable = false)
    private Timestamp diary_creation_time;
    @Column(name = "diary_last_update_time", nullable = false)
    private Timestamp diary_last_update_time;
}