package org.example.module3;

import java.util.List;

public class Tv {
    String name;
    Double price;
    Integer variaty;

    public Tv(String name, Double price, Integer variaty) {
        this.name = name;
        this.price = price;
        this.variaty = variaty;

    }

    public String getName() {
        return name;
    }

    public Integer getVariaty() {
        return variaty;
    }

    public Double getPrice() {
        return price;
    }


}
