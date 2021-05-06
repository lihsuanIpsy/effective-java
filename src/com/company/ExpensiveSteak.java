package com.company;

public class ExpensiveSteak {
  int price;

  private static ExpensiveSteak steak;

  private static ExpensiveSteak createSteak() {
    try {
      Thread.sleep(3000);
    } catch (Exception ex) {
      System.out.println(ex);
    }
    return new ExpensiveSteak();
  }

  public static ExpensiveSteak getSteakWithoutCache() {
    return createSteak();
  }

  public static ExpensiveSteak getSteakWithCache() {
    if (steak == null) {
      steak = createSteak();
    }
    return steak;
  }
}
