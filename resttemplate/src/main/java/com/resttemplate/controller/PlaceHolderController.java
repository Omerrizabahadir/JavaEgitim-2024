package com.resttemplate.controller;

import com.resttemplate.dto.Comment;
import com.resttemplate.dto.Post;
import com.resttemplate.service.PlaceHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceHolderController {
    @Autowired
    private PlaceHolderService placeHolderService;


    @GetMapping("/posts")
    public List<Post> getAllPostList(){

        return placeHolderService.getAllPostList();
    }
    @GetMapping("/posts/{id}/comments")
    public List <Comment> getPostCommentsById(@PathVariable("id")Long id){
        return placeHolderService.getPostCommentsById(id);
    }
    @GetMapping("/comments")
    public List <Comment> getCommentByPostId(@RequestParam("postId")Long postId){
        return placeHolderService.getCommentsByPostId(postId);
    }

    @PostMapping("/create")
    public Post createPost(@RequestBody Post post){

        return placeHolderService.createPost(post);
    }
    @PutMapping("/update/{id}")
    public Post updatePost(@PathVariable("id")Long id,
                           @RequestBody Post post){
        return placeHolderService.updatePost(post,id);
    }
    @DeleteMapping("/{id}")
    public Post deletePost(@PathVariable("id")Long id){
        return placeHolderService.deletePost(id);

    }
}
