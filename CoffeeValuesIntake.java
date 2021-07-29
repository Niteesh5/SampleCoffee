package com.coffee.bean;
import com.coffee.presentation.*;
public class CoffeeValuesIntake {
	protected int coffeeNumber;
	int coffeeSize;
	int coffeeAddon;
	int extraCoffee;
	int extraAddon;
	String voucherName;

	public CoffeeValuesIntake(int coffeeNumber, int coffeeSize, int coffeeAddon, int extraCoffee, int extraAddon,String voucherName) {
        this.coffeeNumber = coffeeNumber;
		this.coffeeSize = coffeeSize;
		this.coffeeAddon = coffeeAddon;
		this.extraCoffee = extraCoffee;
		this.extraAddon = extraAddon;
		this.voucherName=voucherName;
		System.out.println("entered pojo");
		System.out.println(coffeeNumber+" "+coffeeAddon+" "+extraCoffee);
	}
	public CoffeeValuesIntake() {
		//System.out.println(coffeeNumber+" "+coffeeAddon+" "+extraCoffee);
	}
	
	public String getVoucherName() {
		return voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
		System.out.println(this.voucherName);
		System.out.println(voucherName);
	}
	public int getCoffeeNumber() {
		return coffeeNumber;
	}
	public void setCoffeeNumber(int coffeeNumber) {
		this.coffeeNumber = coffeeNumber;
	}
	public int getCoffeeSize() {
		return coffeeSize;
	}
	public void setCoffeeSize(int coffeeSize) {
		this.coffeeSize = coffeeSize;
	}
	public int getCoffeeAddon() {
		return coffeeAddon;
	}
	public void setCoffeeAddon(int coffeeAddon) {
		this.coffeeAddon = coffeeAddon;
	}
	public int getExtraCoffee() {
		return extraCoffee;
	}
	public void setExtraCoffee(int extraCoffee) {
		this.extraCoffee = extraCoffee;
	}
	public int getExtraAddon() {
		return extraAddon;
	}
	public void setExtraAddon(int extraAddon) {
		this.extraAddon = extraAddon;
	}
	
}
