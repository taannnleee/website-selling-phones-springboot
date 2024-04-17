package org.example.websitesellingphonesbackend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Cart")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Cart implements Serializable {
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private Long cartID;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<LineItem> lslineItems;

    @ManyToOne
    private User customer;

    private Float totalPrice;
}
