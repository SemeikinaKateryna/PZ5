package ua.nure.st.kpp.example.demo.entity;

import ua.nure.st.kpp.example.demo.entity.Protection;

public class Router {
    int RouterID;
    String typeOfRouter;
    int maxSpeed;
    double wifiFrequency;
    int numberOfAntennas;
    String color;
    int weight;
    int power;
    Protection protection;
    String brand;
    double price;
    public Router(int RouterID, String typeOfRouter, int maxSpeed, double wifiFrequency,
                  int numberOfAntennas, String color, int weight, int power, Protection protection,
                  String brand, double price) {
        this.RouterID = RouterID;
        this.typeOfRouter = typeOfRouter;
        this.maxSpeed = maxSpeed;
        this.wifiFrequency = wifiFrequency;
        this.numberOfAntennas = numberOfAntennas;
        this.color = color;
        this.weight = weight;
        this.power = power;
        this.protection = protection;
        this.brand = brand;
        this.price = price;
    }

    public Router() {
    }
    public String toString(){
        return  "ID: " + RouterID + " Type: " + typeOfRouter + " maxSpeed: "+maxSpeed
                +" wifiFrequency: " + wifiFrequency + " numberOfAntennas: " + numberOfAntennas
                + " color: " + color + " weight: " + weight  + " power: " + power
                + " protection: " + protection + " brand: " + brand  + " price: " + price;
    }

    public int getRouterID() {
        return RouterID;
    }
    public void setRouterID(int routerID) {
        RouterID = routerID;
    }

    public String getTypeOfRouter() {
        return typeOfRouter;
    }

    public void setTypeOfRouterID(String typeOfRouterID) {
        this.typeOfRouter = typeOfRouterID;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWifiFrequency() {
        return wifiFrequency;
    }

    public void setWifiFrequency(double wifiFrequency) {
        this.wifiFrequency = wifiFrequency;
    }

    public int getNumberOfAntennas() {
        return numberOfAntennas;
    }

    public void setNumberOfAntennas(int numberOfAntennas) {
        this.numberOfAntennas = numberOfAntennas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
