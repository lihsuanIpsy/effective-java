package com.company;

public class InheritedFurnituredApartment extends Apartment {
  String name;

  InheritedFurnituredApartment (int width, int length, String name) {
    super(width, length);
    this.name = name;
  }

  // Bad attempt 1
  @Override
  public boolean equals (Object o) {
    if (o instanceof InheritedFurnituredApartment) {
      InheritedFurnituredApartment inheritedFurnituredApartment = (InheritedFurnituredApartment) o;
      return super.equals(o) && inheritedFurnituredApartment.name.equals(name);
    }
    if (o instanceof Apartment) {
      return super.equals(o);
    }
    return false;
  }

  // Bad attempt 2
//  @Override
//  public boolean equals (Object o) {
//    if (!(o instanceof InheritedFurnituredApartment)) {
//      return false;
//    }
//    InheritedFurnituredApartment inheritedFurnituredApartment = (InheritedFurnituredApartment) o;
//    return super.equals(o) && inheritedFurnituredApartment.name == name;
//  }
}
