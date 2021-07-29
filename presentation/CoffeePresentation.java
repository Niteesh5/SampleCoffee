package com.coffee.presentation;
import com.coffee.bean.*;
import com.coffee.persistance.CoffeeDao;
import com.coffee.service.*;
import java.util.*;
public class CoffeePresentation {
	
	CoffeeService coffeeService=new CoffeeService();
	
	public void showMenu() {
		
		
		Collection<Coffee> c=coffeeService.showCoffee();
		//Collection<Coffee> c=employeeService.getAllEmployees();
        for(Coffee c1 : c)
        	System.out.println(c1);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Coffee Type ");
		String coffeeType=s.nextLine();
		System.out.println("Enter Coffee Size ");
		String coffeeSize=s.nextLine();
			
		
		int price=coffeeService.getCoffeeValue(coffeeType,coffeeSize);
		System.out.println(price);
		
		Collection<Addon>a=coffeeService.showPrefers();
		for(Addon a1:a){
			System.out.println(a1);
		}

		System.out.println("Enter your preferred Addon ");
		String coffeeAddon=s.nextLine();
		price+=coffeeService.getAddonValue(coffeeAddon);
		System.out.println("Enter if you want other Addon ");
		int answer=s.nextInt();
		String s2="Yes";
			   while(answer==1){
				   System.out.println("What do you want as your next Addon");
				   String addAddon=s.nextLine();
				   price+=coffeeService.getAddonValue(addAddon);
				   s.nextLine();
				   System.out.println("Do you want another Addon");
				   answer=s.nextInt();
			   }
		System.out.println(price);
		
		System.out.println("Enter if you want extra coffee ");
		int answer2=s.nextInt();
		if(answer2==1) {
			while(answer2==1) {
				int newPrice;
				s.nextLine();
				System.out.println("Enter Coffee Type ");
				coffeeType=s.nextLine();
				System.out.println("Enter Coffee Size ");
				coffeeSize=s.nextLine();
				newPrice=coffeeService.getCoffeeValue(coffeeType,coffeeSize);				
				System.out.println("Enter your preferred Addon ");
				String coffeeAddon1=s.nextLine();
				price+=coffeeService.getAddonValue(coffeeAddon1);
				System.out.println("Enter if you want other Addon ");
				int answer1=s.nextInt();
				   if(answer1==1) {
					   while(answer1==1){
						   System.out.println("What do you want as your next Addon");
						   String addAddon1=s.nextLine();
						   price+=coffeeService.getAddonValue(addAddon1);
						   s.nextLine();
						   System.out.println("Do you want another Addon");
						   answer1=s.nextInt();
					   }
				   }			
			price+=newPrice;
			System.out.println(newPrice);
			System.out.println("Do you want another coffee");
			answer2=s.nextInt();
		}	
		}
		System.out.println(price);
		
		//System.out.println("Total Cost is"+totalCost);
	
	}
	
}
