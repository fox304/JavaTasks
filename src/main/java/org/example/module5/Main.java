/*
Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых
простое количество страниц, фамилия автора содержит «А» и год издания не позднее 2010 г.
 */

package org.example.module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Турецкий гамбит", "Акунин", 700.0, 2010, 797);
        Books book2 = new Books("Десять нeгpитят", "Кристи", 650.0, 2011, 887);
        Books book3 = new Books("Мастер и Маргарита", "Булгаков", 300.0, 2015, 457);
        Books book4 = new Books("Мартин Иден", "Лондон", 345.3, 2002, 811);
        Books book5 = new Books("Гордость и предубеждение", "Остен", 900.0, 1959, 450);
        Books book6 = new Books("Поющие в терновнике", "Маккалоу", 5550.0, 1890, 991);
        Books book7 = new Books("К оружию! К оружию!", "Пратчетт", 480.6, 2014, 669);
        Books book8 = new Books("Денискины рассказы", "Драгунский", 320.0, 2010, 673);

        List<Books> listBooks = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8));
        System.out.println("Название книг , удовлетворяющих условию : \n");
        for (Books book : listBooks) {
            if (book.PrimeNumbers(book.getCount()) &&
                    (book.getAuthor().contains("а") || book.getAuthor().contains("А")) &&
                    book.getYear() >= 2010) {
                System.out.println(book.getTitleBook());
            }

        }

    }
}
