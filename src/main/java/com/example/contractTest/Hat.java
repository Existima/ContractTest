package com.example.contractTest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hat {
    private Long id;
    private String name;
    private String color;
    private Long price;
}