package com.example.springboot_feign_client.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot_feign_client.dto.request.Request;
import com.example.springboot_feign_client.dto.response.Response;

@FeignClient(name = "web-service-client", url = "https://jsonplaceholder.typicode.com")
public interface WebServiceClient {

    @GetMapping("/users")
    public List<Response> getUsers();

    @GetMapping("/users/{id}")
    public Response getUserById(@PathVariable("id") int id);

    @PostMapping("/posts")
    public Request createPost(Request request);

    @DeleteMapping("/posts/{id}")
    void deletePost(@PathVariable("id") int id);
    
}
