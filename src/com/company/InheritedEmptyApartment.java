package com.company;

public class InheritedEmptyApartment extends Apartment {
  String reason;

  InheritedEmptyApartment (int width, int length, String reason) {
    super(width, length);
    this.reason = reason;
  }

  // Bad attempt 1
  @Override
  public boolean equals (Object o) {
    if (o instanceof InheritedEmptyApartment) {
      InheritedEmptyApartment inheritedEmptyApartment = (InheritedEmptyApartment) o;
      return super.equals(o) && inheritedEmptyApartment.reason.equals(reason);
    }
    if (o instanceof Apartment) {
      return super.equals(o);
    }
    return false;
  }
}
