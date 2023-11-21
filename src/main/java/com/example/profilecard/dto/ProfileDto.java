package com.example.profilecard.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class ProfileDto {
    private UUID uuid;
    private String name;
    private String dob;
    private String phone;
    private String image;
}
