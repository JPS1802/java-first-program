package com.h2;

import java.util.Scanner;
import java.util.Map;

public class BestLoanRates {
    public static final Map<Integer, Float> bestRates =
            Map.of(
            k1:1, v1:5.50f,
            k2:2, v2:3.45f,
            k3:3, v3:2.67f);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
