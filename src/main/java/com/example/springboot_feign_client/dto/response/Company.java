package com.example.springboot_feign_client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company{
    public String name;
    public String catchPhrase;
    public String bs;
}
