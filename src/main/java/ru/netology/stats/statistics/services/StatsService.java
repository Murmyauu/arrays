package ru.netology.stats.statistics.services;

public class StatsService {

    public int calcSalesAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double calcAverageAmount(int[] sales) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;
        return average;
    }

    public int calcMaxRevenue(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calcMinRevenue(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int selling : sales) {
            if (selling <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calcMonthsBelowAverage(int[] sales) {
        int average = (int) calcAverageAmount(sales);
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                months = months + 1;
            }
        }
        return months;
    }

    public int calcMonthsAboveAverage(int[] sales) {
        int average = (int) calcAverageAmount(sales);
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                months = months + 1;
            }
        }
        return months;
    }
}