package com.microservice.authservice.vo.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponsePost {
    private Long id;
    private String postType;
    private String title;
    private String content;
    private String createdDate;
    private String writer;
    private String status;

    @Builder
    public ResponsePost(
            Long id,
            String postType,
            String title,
            String content,
            String createdDate,
            String writer,
            String status
    ) {
        this.id = id;
        this.postType = postType;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.writer = writer;
        this.status = status;
    }
}
