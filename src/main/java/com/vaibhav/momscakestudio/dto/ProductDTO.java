package com.vaibhav.momscakestudio.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Long id;

    private String name;

    private int categoryId;

    private double weight;

    private double price;

    private String description;

    private String imageName;

}
