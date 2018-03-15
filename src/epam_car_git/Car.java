/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam_car_git;

/**
 *
 * @author paradaise
 */
public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Car(int id, String manufacturer, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", year=" + year + ", color=" + color + ", price=" + price + ", registrationNumber=" + registrationNumber + '}';
    }
        
}
