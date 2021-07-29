package com.coffee.service;
import com.coffee.bean.*;
import com.coffee.persistance.*;
import java.lang.*;
import java.util.Collection;
public class CoffeeService{
	
	String coffeeType,coffeeSize,addOn;
	int price;
	
	CoffeeDao coffeeDao=new CoffeeDao();
	CoffeeDaoForView coffeeDaoForView=new CoffeeDaoForView();
	
    public Collection<Coffee> showCoffee() {
		
		return coffeeDaoForView.getCoffeeView();
	}

    public Collection<Addon> showPrefers() {
		
		return coffeeDaoForView.getAddonView();
	}

	
	public int getCoffeeValue(String coffeeType,String coffeeSize) {
		price=coffeeDao.getCoffeePrice(coffeeType,coffeeSize);
		return price;
	}
	public int getAddonValue(String addOn) {
		//addOn=this.addOn;
		price=coffeeDao.getAddOnPrice(addOn);
		return price;
		
	}
	
	
}
