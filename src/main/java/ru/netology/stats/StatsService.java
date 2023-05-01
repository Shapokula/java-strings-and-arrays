package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public long sumSales(long[] sales) {
        long sumSales = 0;

        for (long s : sales) {
            sumSales = sumSales + s;
        }

        return sumSales;
    }

    //средняя сумма продаж
    public long averageSales(long[] sales) {
        long averageSales;

        averageSales = sumSales(sales) / sales.length;

        return averageSales;
    }

    //номер месяца, в котором был максимум продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //номер месяца, в котором был минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int belowAverageSales(long[] sales) {
        int belowAverageSales = 0;
        long averageSales = averageSales(sales);

        for (long s : sales) {
            if (s < averageSales) {
                belowAverageSales++;
            }
        }

        return belowAverageSales;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int aboveAverageSales(long[] sales) {
        int aboveAverageSales = 0;
        long averageSales = averageSales(sales);

        for (long s : sales) {
            if (s > averageSales) {
                aboveAverageSales++;
            }
        }

        return aboveAverageSales;
    }

}
