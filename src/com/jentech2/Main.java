package com.jentech2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     // Creating a car dealership with a maximum of 5 cars on display
     CarDealership dealership = new CarDealership("XYZ Auto", 5);

     // Counting the number of cars initially
     System.out.println("Number of cars initially: " + dealership.getCarsInStockCount());

     // Adding cars to the dealership's stock
     dealership.addCarToStock(new Car("Toyota", 25000.0, EngineType.PETROL));
     dealership.addCarToStock(new Car("Tesla", 75000.0, EngineType.ELECTRIC));
     dealership.addCarToStock(new Car("Honda", 28000.0, EngineType.HYBRID));
     dealership.addCarToStock(new Car("Ford", 32000.0, EngineType.DIESEL));
     dealership.addCarToStock(new Car("Nissan", 22000.0, EngineType.PETROL));
     dealership.addCarToStock(new Car("Chevrolet", 30000.0, EngineType.HYBRID));

     // Counting the number of cars after adding a new car
     System.out.println("Number of cars after adding a new car: " + dealership.getCarsInStockCount());

     // Checking the cars currently in stock
     System.out.println("\nCars currently in stock at " + dealership.getName() + ":");
     Car[] carsInStock = dealership.getCarsInStock();
     for (Car car : carsInStock) {
      if (car != null) {
       System.out.println(car.getManufacturer() + " " + car.getEngineType());
      }
     }
     System.out.println();

     // Finding a car by manufacturer
     String searchManufacturer = "Toyota";
     Car foundCar = dealership.findCarByManufacturer(searchManufacturer);
     if (foundCar != null) {
      System.out.println("Car found with manufacturer '" + searchManufacturer + "':");
      System.out.println(foundCar);
     } else {
      System.out.println("Car with manufacturer '" + searchManufacturer + "' not found in the dealership's stock.");
     }

     System.out.println();

     double searchPrice = 75000.0;
     Car foundCar1 = dealership.findCarByPrice(searchPrice);
     if (foundCar1 != null){
      System.out.println("Car found with price '" + searchPrice + "':");
      System.out.println(foundCar1);
     }else {
      System.out.println("Car with price '" + searchPrice + "' not found in the dealership's stock");
     }
    }
}