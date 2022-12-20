package org.example.module4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Oil brand1 = new Oil("Великобритания", "легкая", "Brent", 825.0f, 79.01f);
        Oil brand2 = new Oil("США", "легкая", "WTI", 827.0f, 75.03f);
        Oil brand3 = new Oil("Россия", "средняя", "Urals", 860.0f, 76.76f);
        Oil brand4 = new Oil("ОАЭ", "средняя", "Dubai Crude", 825.0f, 75.78f);
        Oil brand5 = new Oil("Великобритания", "легкая", "Brent", 825.0f, 79.0f);
        Oil brand6 = new Oil("Венесуэлла", "тяжелая", "Petrozuata Heavy", 950.0f, 60.0f);


        List<Oil> listOils = new ArrayList<>(Arrays.asList(brand1, brand2, brand3, brand4, brand5, brand6));
        System.out.println("Введите сорт : легкая,средняя,тяжелая");
        Scanner sc = new Scanner(System.in);

        Float min = 10000f;
        Oil betterPrice =brand1;
        boolean wrong = true;
        String str = null;

        while(wrong){
            System.out.println("Сделайте правильный ввод сорта нефти ");
            str  = sc.nextLine();
            wrong = switch (str) {
                case ("легкая"), ("средняя"), ("тяжелая") -> false;
                default -> true;
            };
        }
        sc.close();

        for (Oil whichOf : listOils) {

            if (whichOf.getVariaty().equals(str) && whichOf.getCost() < min) {
                min = whichOf.getCost();
                betterPrice = whichOf;
            }
        }

        System.out.println("У товара "+betterPrice.getName()+ " сорт "+betterPrice.getVariaty()+
        " наименьшая цена "+betterPrice.getCost());
    }
}
