package org.example.websitesellingphonesbackend.entities;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Comment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentID;

    @ManyToOne
    private Product product;

    private Float star;
    private String review;

    @ManyToOne
    private User customer;
}
