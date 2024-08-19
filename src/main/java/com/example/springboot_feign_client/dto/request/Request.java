package com.example.springboot_feign_client.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Request{
    public int id;
    public String title;
    public String body;
    public int userId;
}
