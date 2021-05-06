package com.company;

public class Item6 {
  // For Item VI
  public static void expensiveMethod() {
    for (int i = 0; i < 10; i++) {
      ExpensiveSteak.getSteakWithoutCache();
    }
  }

  public static void expensiveMethodWithCache() {
    for (int i = 0; i < 10; i++) {
      ExpensiveSteak.getSteakWithCache();
    }
  }

  public static void unboxing() {
    Long l = 0L;
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      l += i;
    }
  }

  public static void unboxingCorrect() {
    long l = 0L;
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      l += i;
    }
  }
}
