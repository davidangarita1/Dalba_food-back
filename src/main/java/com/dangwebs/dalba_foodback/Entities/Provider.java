package com.dangwebs.dalba_foodback.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;
    private String phone;
}
