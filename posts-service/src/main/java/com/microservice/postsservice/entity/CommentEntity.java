package com.microservice.postsservice.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="comments")
@NoArgsConstructor
public class CommentEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="comment_id")
    Long id;

    @Column(nullable = false)
    String writer;

    @Column(nullable = false)
    String comment;

    @Column(nullable = false)
    String createdDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="post_id")
    @JsonBackReference
    private PostEntity post;

    @Builder
    public CommentEntity(
            Long id,
            String writer,
            String comment,
            String createdDate,
            PostEntity post
    ) {
        this.id = id;
        this.writer = writer;
        this.comment = comment;
        this.createdDate = createdDate;
        this.post = post;
    }

    public void setPost(PostEntity post) {
        this.post = post;

        if(!post.getComments().contains(this)) {
            post.getComments().add(this);
        }
    }
}