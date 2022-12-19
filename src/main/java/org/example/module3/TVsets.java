/*
 Дан массив записей: наименование товара, цена, сорт.
 Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 название которых содержит «LED
 */

package org.example.module3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TVsets {
    public static void main(String[] args) {
 

        Tv tv1 = new Tv("Samsung",55.0,1);
        Tv tv2 = new Tv("LG LED",50.0,1);
        Tv tv3 = new Tv("Philips LED",35.0,2);
        Tv tv4 = new Tv("BBK",24.0,3);
        Tv tv5 = new Tv("Thomson",27.0,3);
        Tv tv6 = new Tv("Xiaomi LED",33.0,2);

        List<Tv> listTv = new ArrayList<>();
        listTv.addAll(Arrays.asList(tv1,tv2,tv3,tv4,tv5,tv6));

        Double topprice = 0.0;
        Tv whichOf = listTv.get(0);

        


        for (int i = 0; i < listTv.size(); i++) {
            if(listTv.get(i).getName().contains("LED") &&
                    (listTv.get(i).getVariaty().equals(1) || listTv.get(i).getVariaty().equals(2))){
                if (listTv.get(i).getPrice() > topprice) {
                    topprice = listTv.get(i).getPrice();
                    whichOf = listTv.get(i);
                }
            }
        }
        System.out.println("Наибольшая цена товаров 1го или 2го сорта \n" +
                "название которых содержит <<LED>> " +
                "является  "+ whichOf.getName() + " с ценой "+ whichOf.getPrice());
    }
}
