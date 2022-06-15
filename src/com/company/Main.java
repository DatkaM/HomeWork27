package com.company;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * sqrt деген метод тузунуз.
 * UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
 * Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).
 * public static UnaryOperator<Double> sqrt().
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println(sqrt().apply(a));


    }
    public static UnaryOperator<Double> sqrt(){
        UnaryOperator <Double> unaryOperator = d -> Math.sqrt(d);
        return unaryOperator;
    }
}