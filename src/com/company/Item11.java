package com.company;

import java.util.HashMap;
import java.util.Map;

public class Item11 {
  public static void checkHashCode() {
    Map<Apartment, Integer> priceMap = new HashMap<>();
    priceMap.put(new Apartment(10, 10), 100);
    System.out.println(priceMap.get(new Apartment(10, 10)));
  }
}
