package com.dangwebs.dalba_foodback.Entities;

import jakarta.persistence.*;
import lombok.NonNull;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private String name;
    private String image;
    private Float price;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @OneToOne
    @JoinColumn(name = "provider_id", referencedColumnName = "id")
    private Provider provider;
}
