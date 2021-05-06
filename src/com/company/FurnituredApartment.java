package com.company;

public class FurnituredApartment {
  Apartment apartment;

  int unitNumber;

  String name;

  @Override
  public boolean equals (Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof FurnituredApartment)) {
      return false;
    }
    FurnituredApartment furnituredApartment = (FurnituredApartment) o;

    return apartment.equals(furnituredApartment.apartment)
        && unitNumber == furnituredApartment.unitNumber
        && name.equals(furnituredApartment.name);
  }
}
