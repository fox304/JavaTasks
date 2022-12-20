/*
Сведения о товаре состоят из
наименования,страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */

package org.example.module4;

public class Oil {

    String country,variaty,name;
    Float weght,cost;

    public Oil(String country, String variaty, String name, Float weght, Float cost) {
        this.country = country;
        this.variaty = variaty;
        this.name = name;
        this.weght = weght;
        this.cost = cost;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVariaty() {
        return variaty;
    }

    public String getName() {
        return name;
    }

    public Float getCost() {
        return cost;
    }
}
