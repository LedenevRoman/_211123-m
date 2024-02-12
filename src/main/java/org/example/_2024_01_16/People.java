package org.example._2024_01_16;

import lombok.Data;

@Data
public class People {
    private String name;
    private int old;
    private int height;

    public People(String name, int old, int height) {
        this.name = name;
        this.old = old;
        this.height = height;
    }
}
