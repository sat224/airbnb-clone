package com.backend.airBnb_app.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable   // JPA provides the @Embeddable annotation to declare that a class will be embedded by other entities.
public class HotelContactInfo {
    private String address;
    private String phoneNumber;
    private String email;
    private String location;
}
