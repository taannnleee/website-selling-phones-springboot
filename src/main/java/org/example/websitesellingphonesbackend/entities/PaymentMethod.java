package org.example.websitesellingphonesbackend.entities;

import java.io.Serializable;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PaymentMethod")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class PaymentMethod implements Serializable   {
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    private Long methodID;

    private String method;
    private String information;
}
