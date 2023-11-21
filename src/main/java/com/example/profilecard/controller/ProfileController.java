package com.example.profilecard.controller;


import com.example.profilecard.dto.ProfileDto;
import com.example.profilecard.model.Profile;
import com.example.profilecard.service.ProfileServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProfileController {
    private final ProfileServiceImpl profileService;

    @PostMapping("/reg")
    public ResponseEntity<ProfileDto> register(@RequestBody Profile profile){
        return new ResponseEntity<>(profileService.signUp(profile), HttpStatus.ACCEPTED);
    }
}
