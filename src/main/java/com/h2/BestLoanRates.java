package com.h2;

import java.util.Scanner;
import java.util.Map;

public class BestLoanRates {

    public static final Map<Integer, Float> bestRates =
            Map.of(
            1, 5.50f,
            2, 3.45f,
            3, 2.67f);

    public static float getRates(int loanTermInYears) {
        if (bestRates.containsKey(loanTermInYears))
        return bestRates.get(loanTermInYears);
        else
        return 0.0f;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name" + "\n");
        String name = scanner.nextLine();
        System.out.print("Hello " + name + "\n");
        System.out.print("Enter the loan term (in years)" + "\n");
        int loanTermInYears = scanner.nextInt();
        float bestRate = getRates(loanTermInYears);
        if (bestRate == 0.0f) {
            System.out.print("No available rates for term: " + loanTermInYears + " years" + "\n");
        }
        else System.out.print("Best Available Rate: " + getRates(loanTermInYears) + "%");
        scanner.close();
    }
}
