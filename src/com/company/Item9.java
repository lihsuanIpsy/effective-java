package com.company;

public class Item9 {
  public static void tryWith() throws Exception {
    try(TestBadStream stream = new TestBadStream()) {
      throw new Exception("try-with exception");
    }
  }

  public static void tryFinally() throws Exception {
    TestBadStream stream = new TestBadStream();
    try {
      throw new Exception("try-finally exception");
    } finally {
      stream.close();
    }
  }

  public static void tryFinallyWithGoodStream() throws Exception {
    TestGoodStream stream = new TestGoodStream();
    try {
      throw new Exception("try-finally exception");
    } finally {
      stream.close();
    }
  }
}
