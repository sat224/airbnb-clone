package com.backend.airBnb_app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Hotel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private String name;

   private String city;

   @Column(columnDefinition = "TEXT[]") // we need to explicitly specific the type of data that is going to store in db table's column
   private String[] photos;

   @Column(columnDefinition = "TEXT[]")
   private String[] amenities;

   @CreationTimestamp
   private LocalDateTime createAt;

   @UpdateTimestamp
   private LocalDateTime updatedAt;

   @Embedded
   private HotelContactInfo contactInfo;

}
