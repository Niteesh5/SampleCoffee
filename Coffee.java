package com.coffee.bean;

public class Coffee {
	String coffeeType;
	String coffeeSize;
	int price;
	public Coffee() {
	}
	public Coffee(String coffeeType, String coffeeSize, int price) {
		super();
		this.coffeeType = coffeeType;
		this.coffeeSize = coffeeSize;
		this.price = price;
	}
	public String getCoffeeType() {
		return coffeeType;
	}
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public String getCoffeeSize() {
		return coffeeSize;
	}
	public void setCoffeeSize(String coffeeSize) {
		this.coffeeSize = coffeeSize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  coffeeType + "||" + coffeeSize + "||" + price;
	}
	

}
