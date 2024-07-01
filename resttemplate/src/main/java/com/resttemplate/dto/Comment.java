package com.resttemplate.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comment {

    private Long postId;
    private Long id;
    private String name;
    private String email;
    private String body;

}
