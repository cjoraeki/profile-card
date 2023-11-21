package com.example.profilecard.service;

import com.example.profilecard.dto.ProfileDto;
import com.example.profilecard.model.Profile;

public interface ProfileService {
    ProfileDto signUp(Profile profile);
}
