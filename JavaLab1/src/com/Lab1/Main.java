package com.Lab1;

public class Main {

    public static void main(String[] args) {
        Helicopter cargo = new Helicopter();
        Helicopter civil = new Helicopter(2500, "HH-65", 15000, 4);
        Helicopter military = new Helicopter(3000, "S-76C", 20000, 10, 600, 13, 1977);

        System.out.println(cargo.toString());
        System.out.println(civil.toString());
        System.out.println(military.toString());

        civil.printNumberBuilt();
        Helicopter.printStaticNumberBuilt();

        military.resetValues(0, null, 0, 0, 0, 0, 0);
        System.out.println(military.toString());
    }
}