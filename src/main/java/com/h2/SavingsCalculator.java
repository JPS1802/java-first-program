package com.h2;
import java.time.localDate;

public class SavingsCalculator {
    private float[] credits;
    private float[] debits;
    public SavingsCalculator (float[] credits, float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }
    private float sumOfCredits(float[] credits) {
        float sum = 0.0f;
        for (float credit : credits) {
            sum += credit;
        }
        return sum;
    }
    private float sumOfDebits(float[] debits) {
        float sum = 0.0f;

        return sum;
    }
    private static int remainingDaysInMonth(localDate date){
        return -1;
    }
}
