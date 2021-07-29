package com.coffee.bean;

public class Addon {
	String addon;
	int price;
	public Addon() {
		// TODO Auto-generated constructor stub
	}
	public Addon(String addon, int price) {
		super();
		this.addon = addon;
		this.price = price;
	}
	public String getAddon() {
		return addon;
	}
	public void setAddon(String addon) {
		this.addon = addon;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  addon + "||" + price ;
	}
	
    
}
