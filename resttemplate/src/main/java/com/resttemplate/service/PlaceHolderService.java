package com.resttemplate.service;

import com.resttemplate.dto.Comment;
import com.resttemplate.dto.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PlaceHolderService {

    //backend isteklerinde RestTemplate restTemplate kullanıyoruz
    @Autowired
    private RestTemplate restTemplate;

    public List<Post> getAllPostList() {
    HttpEntity<?> entity = getStringHttpEntity(null);

        //istek atıcaz.1.yol örnek->restTemplate.exchange(http://localhost:8080/products),2.yol->restTemplate.fetForObject(URI_CUSTOMER,Customer().class)
        return restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/posts", HttpMethod.GET, entity, new ParameterizedTypeReference<List<Post>>() {
                }).getBody();
    }
    public List <Comment> getPostCommentsById(Long id){
        HttpEntity<?> entity = getStringHttpEntity(null);
        return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts/1/comments",HttpMethod.GET, entity, new ParameterizedTypeReference<List<Comment>>() {}).getBody();
    }
    public List <Comment> getCommentsByPostId(Long postId){
        HttpEntity <?> entity = getStringHttpEntity(null);
        return restTemplate.exchange("https://jsonplaceholder.typicode.com/comments?postId=1", HttpMethod.GET, entity, new ParameterizedTypeReference<List<Comment>>() {}).getBody();
    }

    public Post createPost(Post post){
        HttpEntity<?> entity = getStringHttpEntity(post);
        return restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/posts/1/comments",HttpMethod.POST,entity, Post.class).getBody();
    }
    public Post updatePost(Post post,Long id){
        HttpEntity<?> entity = getStringHttpEntity(post);
        return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts/1", HttpMethod.PUT, entity, Post.class).getBody();
    }
    public Post deletePost(Long id){
        HttpEntity <?> entity = getStringHttpEntity(null);
        return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts/1", HttpMethod.DELETE, entity, Post.class).getBody();
    }

    private HttpEntity<?> getStringHttpEntity(Post post) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        return post == null ? new HttpEntity<>(headers) : new HttpEntity<>(post,headers);
        /*short if-->post = null mı. null ise new HttpEntity<>(headers) ---->yani sadece headers'ı getir.
         null değil ise new HttpEntity<>(post,headers) ----->body ile birlikte headers (gövdeli getir)hepsini getir*/
    }
}
