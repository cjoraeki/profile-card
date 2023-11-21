package com.example.profilecard.service;


import com.example.profilecard.dto.ProfileDto;
import com.example.profilecard.model.Profile;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ProfileServiceImpl implements ProfileService{
    @Override
    public ProfileDto signUp(Profile profile) {
        Profile profile1 = new Profile();
        profile1.setName(profile.getName());
        profile1.setDob(profile.getDob());
        profile1.setPhone(profile.getPhone());
        var profileDto = new ProfileDto();
        BeanUtils.copyProperties(profile1, profileDto);
        return profileDto;
    }
}
