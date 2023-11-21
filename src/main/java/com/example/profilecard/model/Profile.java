package com.example.profilecard.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;
import java.util.UUID;


//@Entity
//@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String name;
    private String dob;
    private String phone;
    private String image;
}
