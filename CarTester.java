package com.syntax.class18;

public class CarTester {
    public static void main(String[] args) {
        Car car1=new Car("Tesla", "Plaid","Black");
        car1.printInfo();
        Car car2=new Car("Toyota", "Corolla", "White");
        car2.printInfo();

        Car car =new Car("Telsa");
    }
}
