package ru.netology;

import ru.netology.services.Service;

public class Main {
    public static void main(String[] args) {
        Service Service = new Service();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int result = Service.calculate(income, expenses, threshold);
        System.out.println(result);
    }
}