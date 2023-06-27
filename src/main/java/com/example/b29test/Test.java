package com.example.b29test;

public class Test {
    public static void main(String[] args) {
        Car car1 =new Car();
//        car1.color="black";
//        System.out.println(car1.color);
//        car1.color="red";
        System.out.println("car1.getColor() = " + car1.getColor());
        car1.setColor("yellow");
        System.out.println("car1.getColor() = " + car1.getColor());
        car1.setModel("tesla");
        System.out.println("car1.toString() = " + car1.toString());
        System.out.println(car1.getColor());

    }
}
interface dogInterface{
    public abstract void bark();


}