package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      Item10.checkEquals();
    }

    public static void tryCatch() {
      try {
        Item9.tryFinallyWithGoodStream();
      } catch (Exception ex) {
        System.out.println("Error message " + ex);
        System.out.println("Suppressed message " + Arrays.toString(ex.getSuppressed()));
      }
    }

    public static void timingMethods() {
      long startTime = System.nanoTime();

      Item6.unboxing();

      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.println(duration/1000000);
    }

    public static void catchExceptions() {

    }
}
