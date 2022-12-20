package org.example.module5;

public class Books {
    String titleBook,author;
    Double price;
    Integer year,count;

    public Books(String titleBook, String author, Double price, Integer year, Integer count) {
        this.titleBook = titleBook;
        this.author = author;
        this.price = price;
        this.year = year;
        this.count = count;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getCount() {
        return count;
    }
    public Boolean PrimeNumbers(Integer num) { // проверка на простое число
        for (int i = 2; i < num/2 + 1; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
}
