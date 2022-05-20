package ru.netology;

public class Main {

    public static void main(String[] args) {
        int account = 100;
        int sum = 1100;

        int limit = sum > 1000 ? 1 : 0;
        int bonus = sum / 100 * limit;
        System.out.println(bonus + account + sum);
    }
}
