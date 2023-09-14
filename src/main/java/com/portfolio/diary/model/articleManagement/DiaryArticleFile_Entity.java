package com.portfolio.diary.model.articleManagement;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "DIARY_ARTICLE_FILE", schema = "portfolio_diary")
public class DiaryArticleFile_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indicates auto-increment
    @Column(name = "diary_article_file_pk", nullable = false)
    private Integer diary_article_file_pk;
    @ManyToOne
    @JoinColumn(name = "diary_article_pk")
    private DiaryArticle_Entity diary_article_pk;
    @Column(name = "file_name", nullable = false)
    private Timestamp file_name;
    @Column(name = "file_type", nullable = false)
    private Timestamp file_type;
}
