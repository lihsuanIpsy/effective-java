package com.company;

import java.io.Closeable;
import java.io.IOException;

public class TestBadStream implements Closeable {
  public void close() throws IOException {
    throw new IOException("some input output issue");
  }
}
