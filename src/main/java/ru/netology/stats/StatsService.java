package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return sum / sales.length;
    }

    public int moreAverageSales(long[] sales) {
        int averageSales = averageSales(sales);
        int moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales < sales[i]) {
                moreSales++;
            }
        }
        return moreSales;
    }

    public int lessAverageSales(long[] sales) {
        int averageSales = averageSales(sales);
        int lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales > sales[i]) {
                lessSales++;
            }
        }
        return lessSales;
    }
}