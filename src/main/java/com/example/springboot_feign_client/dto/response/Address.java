package com.example.springboot_feign_client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address{
    public String street;
    public String suite;
    public String city;
    public String zipcode;
    public Geo geo;
}
