package com.microservice.postsservice.vo;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Getter
public class RequestPost {
    @NotNull(message="postType cannot be null")
    private String postType;

    @NotNull(message="title cannot be null")
    @Size(min=10, message="title cannot be less than 10 characters")
    private String title;

    @NotNull(message="content cannot be null")
    @Size(min=10, message="content cannot be less than 10 characters")
    private String content;

    private Long rentalPrice;

    private List<String> date;

    @NotNull(message="writer cannot be null")
    private String writer;

    @NotNull(message="userId cannot be null")
    private String userId;

    List<MultipartFile> images;
}
