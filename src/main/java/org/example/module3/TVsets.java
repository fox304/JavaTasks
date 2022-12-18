/*
 Дан массив записей: наименование товара, цена, сорт.
 Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 название которых содержит «LED
 */

package org.example.module3;

public class TVsets {
    public static void main(String[] args) {

        Tv tv1 = new Tv("Samsung",50.0,1);
        Tv tv2 = new Tv("LG LED",55.0,1);
        Tv tv3 = new Tv("Philips LED",35.0,2);
        Tv tv4 = new Tv("BBK",24.0,3);
        Tv tv5 = new Tv("Thomson",27.0,3);
        Tv tv6 = new Tv("Xiaomi LED",33.0,2);



    }
}
