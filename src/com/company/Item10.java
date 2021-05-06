package com.company;

public class Item10 {
  public static void checkEquals() {
    FurnituredApartment furnituredApartmentA = new FurnituredApartment(
        new Apartment(10, 10), 10, "Fav Apartment"
    );
    FurnituredApartment furnituredApartmentB = new FurnituredApartment(
        new Apartment(10, 10), 10, "Fav Apartment"
    );
    System.out.println(furnituredApartmentA.equals(furnituredApartmentB));
  }

  public static void checkNotEquals() {
    InheritedFurnituredApartment furnituredApartmentA = new InheritedFurnituredApartment(
        10, 10,  "Fav Apartment"
    );
    Apartment furnituredApartmentB = new Apartment(
        10, 10
    );
    System.out.println(furnituredApartmentB.equals(furnituredApartmentA));
    System.out.println(furnituredApartmentA.equals(furnituredApartmentB));
  }
}
