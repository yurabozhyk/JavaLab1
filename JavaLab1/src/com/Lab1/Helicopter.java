package com.Lab1;

public class Helicopter {

    private static int numberBuilt = 0;

    protected int price;
    protected int yearBuilt;

    private int maxLiftWeight;
    private String name;
    private int maxHeight;
    private int passengerCapacity;
    private int maxSpeedLimit;


    public Helicopter() {

        this(10, "Toy", 100, 1, 10, 1, 2019);
    }

    public Helicopter(int maxLiftWeight, String name, int maxHeight, int passengerCapacity) {

        this(maxLiftWeight, name, maxHeight, passengerCapacity, 800, 15, 2000);
    }

    public Helicopter(int maxLiftWeight, String name, int maxHeight, int passengerCapacity, int maxSpeedLimit, int price, int yearBuilt) {

        this.maxLiftWeight = maxLiftWeight;
        this.name = name;
        this.maxHeight = maxHeight;
        this.passengerCapacity = passengerCapacity;
        this.maxSpeedLimit = maxSpeedLimit;
        this.price = price;
        this.yearBuilt = yearBuilt;
        numberBuilt++;
    }


    public void setMaxLiftWeight(int maxLiftWeight) {
        this.maxLiftWeight = maxLiftWeight;
    }

    public int getMaxLiftWeight() {
        return maxLiftWeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setMaxSpeedLimit(int maxSpeedLimit) {
        this.maxSpeedLimit = maxSpeedLimit;
    }

    public int getMaxSpeedLimit() {
        return maxSpeedLimit;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }


    public String toString() {
        return "\n\tHelicopter\n"
                + "Max lifting weight: " + maxLiftWeight + " kg\n"
                + "Name: " + name + "\n"
                + "Max height: " + maxHeight + "m\n"
                + "Passenger capacity: " + passengerCapacity + "\n"
                + "Max speed limit: " + maxSpeedLimit + " km/h\n"
                + "Price: " + price + "M$\n"
                + "Year built: " + yearBuilt;
    }

    public static void printStaticNumberBuilt() {
        System.out.println(numberBuilt + " helicopter built.");
    }

    public void printNumberBuilt() {
        System.out.println(numberBuilt + " helicopter built.");
    }

    public void resetValues(int maxLiftWeight, String name, int maxHeight, int passengerCapacity, int maxSpeedLimit, int price, int yearBuilt) {

        this.maxLiftWeight = maxLiftWeight;
        this.name = name;
        this.maxHeight = maxHeight;
        this.passengerCapacity = passengerCapacity;
        this.maxSpeedLimit = maxSpeedLimit;
        this.price = price;
        this.yearBuilt = yearBuilt;
    }
}
