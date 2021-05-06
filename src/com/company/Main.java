package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      Item11.checkHashCode();
    }

    public static void tryCatch() {
      try {
        Item9.tryFinally();
      } catch (Exception ex) {
        System.out.println("Error message " + ex);
        System.out.println("Suppressed message " + Arrays.toString(ex.getSuppressed()));
      }
    }

    public static void timingMethods() {
      long startTime = System.nanoTime();

      Item6.unboxingCorrect();

      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.println(duration/1000000);
    }

    public static void catchExceptions() {

    }
}
