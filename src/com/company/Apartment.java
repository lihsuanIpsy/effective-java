package com.company;

public class Apartment {
  int width;

  int length;

  @Override
  public boolean equals (Object o) {
    if (o == null) {
      return false;
    }
    if (!(o instanceof Apartment)) {
      return false;
    }
    Apartment apartment = (Apartment) o;

    return width == apartment.width && length == apartment.length;
  }
}
