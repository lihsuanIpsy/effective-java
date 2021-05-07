package com.company;

public class Item10 {
  public static void checkEquals() {
    FurnituredApartment furnituredApartmentA = new FurnituredApartment(
        new Apartment(10, 10), 10, "Fav Apartment"
    );
    FurnituredApartment furnituredApartmentB = new FurnituredApartment(
        new Apartment(10, 10), 10, "Fav Apartment"
    );

    System.out.println("Each instance is equivalent to itself " + furnituredApartmentA.equals(furnituredApartmentA));

    System.out.println("Two equal valued instances are equal " + furnituredApartmentA.equals(furnituredApartmentB));
    System.out.println("Regardless of which way you compare it " + furnituredApartmentB.equals(furnituredApartmentA));

    FurnituredApartment furnituredApartmentC = new FurnituredApartment(
        new Apartment(10, 10), 10, "Fav Apartment"
    );
    System.out.println("Transitivity holds as expected " + furnituredApartmentA.equals(furnituredApartmentB));
    System.out.println("And can be proven as such " + furnituredApartmentB.equals(furnituredApartmentC));
    System.out.println("Comparing first and third instances " + furnituredApartmentA.equals(furnituredApartmentC));

    System.out.println("Regardless of how many times you call it");
    for (int i = 0; i < 5; i++) {
      System.out.println("Result will be the same " + furnituredApartmentA.equals(furnituredApartmentB));
    }

    System.out.println("Return false when comparing to null " + furnituredApartmentA.equals(null));


  }

  public static void breakSymmetry() {
    InheritedFurnituredApartment furnituredApartmentA = new InheritedFurnituredApartment(
        10, 10,  "Fav Apartment"
    );
    Apartment apartmentB = new Apartment(
        10, 10
    );
    System.out.println("Furnitured apartment A equal to apartment B? " +
        furnituredApartmentA.equals(apartmentB));
    System.out.println("Apartment B equal to furnitured apartment A? " +
        apartmentB.equals(furnituredApartmentA));
  }

  public static void breakTransitivity() {
    InheritedFurnituredApartment furnituredApartmentA = new InheritedFurnituredApartment(
        10, 10,  "Fav Apartment"
    );
    Apartment apartmentB = new Apartment(
        10, 10
    );
    InheritedFurnituredApartment furnituredApartmentC = new InheritedFurnituredApartment(
        10, 10,  "Not Fav Apartment"
    );
    System.out.println("Furnitured apartment A equal to apartmentB ? " +
            furnituredApartmentA.equals(apartmentB));
    System.out.println("Apartment B equal to furnitured apartment C? " + apartmentB.equals(furnituredApartmentC));
    System.out.println("Furnitured apartment A equal to furnitured apartment C? " + furnituredApartmentA.equals(furnituredApartmentC));
  }
}
