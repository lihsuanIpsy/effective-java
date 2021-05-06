package com.company;

import java.io.FileInputStream;

public class Item9 {
  public static void tryWith() throws Exception {
    try(TestStream stream = new TestStream()) {
      throw new Exception("try-with exception");
    }
  }

  public static void tryFinally() throws Exception {
    TestStream stream = new TestStream();
    try {
      throw new Exception("try-finally exception");
    } finally {
      stream.close();
    }
  }
}
