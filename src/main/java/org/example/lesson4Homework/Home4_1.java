package org.example.lesson4Homework;

/*
Вывести список на экран в перевернутом виде (без массивов)
Пример:
1 -> 2->3->4
Вывод:
4->3->2->1
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Home4{
    public static void main(String[] args) {
        LinkedList<String > li = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4 элемента ");
        for (int i = 0; i < 4; i++) {
            li.add(sc.nextLine());
        }
        sc.close();
        System.out.println("Введёный список "+li);
        int size = li.size()-1;
        for (int i = size; i >= 0; i--) li.add(li.get(i));// добавляем элементы в обратном порядке
        li.subList(0,size+1).clear();                    // удаляем первые 4 элемента
        System.out.println("Полученный список "+li);


    }
}