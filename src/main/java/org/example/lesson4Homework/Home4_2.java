/*
Определить является ли список знакочередующимся? (без массивов)
 */

package org.example.lesson4Homework;

import java.util.LinkedList;

public class Home4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> listInt = new LinkedList<>();


        listInt.add(1);
        listInt.add(-5);
        listInt.add(5);
        listInt.add(-5);
        listInt.add(80);
        listInt.add(-5);
        listInt.add(10);
        listInt.add(-5);

        boolean x = listInt.get(0)>=0;
        String g = "";

        for (int i = 1; i < listInt.size(); i++) {
            boolean y = listInt.get(i)>=0;
            if (x != y) x = y;
            else {
                g="Flag";
                break;
            }
        }
        if(!g.equals("Flag")) System.out.println("Список знакочередующийся ");
        else System.out.println("Список не является знакочередующимся");

    }

}
