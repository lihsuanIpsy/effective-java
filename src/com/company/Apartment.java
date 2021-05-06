package com.company;

public class Apartment {
  int width;

  int length;

  Apartment (int width, int length) {
    this.width = width;
    this.length = length;
  }

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

  @Override
  public int hashCode() {
    int result = Integer.hashCode(width);
    result += 31 * result + length;
    return result;
  }
}
