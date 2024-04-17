package org.example.websitesellingphonesbackend.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Discount")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Discount implements Serializable {
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    private Long discountID;

    private String name;

    private int discount;

    @Temporal(TemporalType.DATE)
    private Date dateStart;

    @Temporal(TemporalType.DATE)
    private Date dateEnd;
}
