package org.example.websitesellingphonesbackend.entities;

import java.io.Serializable;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "LineItem")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class LineItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Product item;

    private int quanlity;
}
