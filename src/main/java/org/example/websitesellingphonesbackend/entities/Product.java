package org.example.websitesellingphonesbackend.entities;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productID;

    private String name;
    private Boolean status;

    private String type;

    private int sale;
    private int stock;
    private String information;
    private Float price;
    private String image;
}
