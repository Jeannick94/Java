package com.jentech2;

import java.util.Arrays;
import java.util.Objects;

public class CarDealership {
    // Properties
    private String name;
    private int maxCarsOnDisplay;
    private Car[] carsInStock; // Using an array to represent cars in stock

    public CarDealership(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = new Car[maxCarsOnDisplay];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    public void setMaxCarsOnDisplay(int maxCarsOnDisplay) {
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return maxCarsOnDisplay == that.maxCarsOnDisplay && Objects.equals(name, that.name) && Arrays.equals(carsInStock, that.carsInStock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, maxCarsOnDisplay);
        result = 31 * result + Arrays.hashCode(carsInStock);
        return result;
    }

    @Override
    public String toString() {
        return "CarDearlership{" +
                "name='" + name + '\'' +
                ", maxCarsOnDisplay=" + maxCarsOnDisplay +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }
    // Method to add a car to the dealership's stock
    public void addCarToStock(Car car) {
        int currentStockSize = getCarsInStockCount();
        if (currentStockSize < maxCarsOnDisplay) {
            carsInStock[currentStockSize] = car;
            System.out.println(car.getManufacturer() + " " + car.getEngineType() + " car added to stock.");
        } else {
            System.out.println("Sorry, the maximum capacity of cars on display has been reached.");
        }
    }
    // Method to get the current count of cars in stock
    public int getCarsInStockCount() {
        int count = 0;
        for (Car car : carsInStock) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }

    public Car findCarByManufacturer(String manufacturer){
        for (Car car : carsInStock){
            if (car != null && car.getManufacturer().equalsIgnoreCase(manufacturer)){
                return car;
            }
        }
        return null;
    }

    public Car findCarByPrice(double price){
        for (Car car : carsInStock){
            if (car != null && (car.getPrice()==price)){
                return car;
            }
        }
        return null;
    }

}
