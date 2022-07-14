package com.busel.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из Юнилайбрери ");
        System.out.println("_________________________________");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Мы возвращаем книгу в Юнилайбрери");
        return "Anna Karenina";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из Юнилайбрери ");
        System.out.println("_________________________________");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в Юнилайбрери");
        System.out.println("_________________________________");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в Юнилайбрери");
        System.out.println("_________________________________");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в Юнилайбрери");
        System.out.println("_________________________________");
    }

}
