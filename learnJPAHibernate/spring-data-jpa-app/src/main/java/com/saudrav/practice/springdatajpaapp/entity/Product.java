package com.saudrav.practice.springdatajpaapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products",
        uniqueConstraints = {
                    @UniqueConstraint(name = "sku_unique", columnNames = {"sku"}),
                    //@UniqueConstraint(name = "name_unique", columnNames = {"name"})
        }
)
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name="stock_keeping_unit", nullable = false)
    private String sku;

    @Column(nullable = false, length = 64)
    private String name;

    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageUrl;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime lastUpdated;

}
