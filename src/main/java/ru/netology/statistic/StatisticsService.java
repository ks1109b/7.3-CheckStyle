package ru.netology.statistic;

public class StatisticsService {

  public long findMax(long[] incomes) {
    long current_max = 0;
    for (long income : incomes)
      if (current_max < income)
        current_max = income;
    return current_max;
  }
}