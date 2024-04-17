package org.example.websitesellingphonesbackend.entities;

import java.io.Serializable;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Invoice")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoiceID;

    @OneToOne
    private Cart cart;

    @ManyToOne(optional = true)
    private Discount discount;

    @Temporal(TemporalType.DATE)
    private Date dateCreate;

    private Float totalInvoice;

    @ManyToOne
    private PaymentMethod payMethod;

    private Boolean status;
}
