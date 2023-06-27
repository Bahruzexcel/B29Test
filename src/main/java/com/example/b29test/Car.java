package com.example.b29test;

public  class Car {
    private String model;
    private static String color;

    public static void anyMethod(){
        color = "no color";
    }

    public String getModel() {

        return model;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "MODEL='" + model + '\'' +
                ", COLOR='" + color + '\'' +
                '}';
    }
}
