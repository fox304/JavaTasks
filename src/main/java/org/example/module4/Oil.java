/*
Сведения о товаре состоят из
наименования,страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */

package org.example.module4;

public class Oil {

    String country, variety,name;
    Float weight,cost;

    public Oil(String country, String variaty, String name, Float weght, Float cost) {
        this.country = country;
        this.variety = variaty;
        this.name = name;
        this.weight = weght;
        this.cost = cost;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVariety() {
        return variety;
    }

    public String getName() {
        return name;
    }

    public Float getCost() {
        return cost;
    }
}
