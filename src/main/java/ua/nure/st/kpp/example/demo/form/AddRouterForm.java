package ua.nure.st.kpp.example.demo.form;

import ua.nure.st.kpp.example.demo.entity.Protection;

public class AddRouterForm {
	int RouterID;
	int typeOfRouterID;
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

	public int getTypeOfRouterID() {
		return typeOfRouterID;
	}

	public void setTypeOfRouterID(int typeOfRouterID) {
		this.typeOfRouterID = typeOfRouterID;
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

	public void setTypeOfRouter(String typeOfRouter) {
		this.typeOfRouter = typeOfRouter;
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

	public AddRouterForm(String typeOfRouter, int maxSpeed, double wifiFrequency,
						 int numberOfAntennas, String color, int weight, int power,
						 Protection protection, String brand, double price) {
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

	public AddRouterForm() {
	}

	@Override
	public String toString() {
		return "AddRouterForm{" +
				"RouterID=" + RouterID +
				", typeOfRouterID='" + typeOfRouterID + '\'' +
				", typeOfRouter='" + typeOfRouter + '\'' +
				", maxSpeed=" + maxSpeed +
				", wifiFrequency=" + wifiFrequency +
				", numberOfAntennas=" + numberOfAntennas +
				", color='" + color + '\'' +
				", weight=" + weight +
				", power=" + power +
				", protection=" + protection +
				", brand='" + brand + '\'' +
				", price=" + price +
				'}';
	}
}
