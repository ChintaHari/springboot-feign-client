package com.example.springboot_feign_client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_feign_client.dto.request.Request;
import com.example.springboot_feign_client.dto.response.Response;
import com.example.springboot_feign_client.feign.WebServiceClient;

@RestController
@RequestMapping("/feign")
public class FeignController {
    
    @Autowired
    private WebServiceClient webServiceClient;

    @GetMapping("/users")
    public List<Response> getUsers() {
        return webServiceClient.getUsers();
    }

    @GetMapping("/users/{id}")
    public Response getUserById(@PathVariable int id) {
        return webServiceClient.getUserById(id);
    }
    
    @PostMapping("/posts")
    public Request createPost(@RequestBody Request request) {
        return webServiceClient.createPost(request);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable int id) {
        webServiceClient.deletePost(id);
    }

}
