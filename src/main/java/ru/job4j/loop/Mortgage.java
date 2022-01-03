package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double creditDebt = amount + (amount * (percent / 100.0));
        while (salary < creditDebt) {
            creditDebt -= salary;
            year++;
        }
        return year;
    }
}
