package Aufgabe_1;

import java.util.ArrayList;

import Aufgabe_1.DVD.COUNTRYCODE;

public class Shoppingcart {
	public static void main(String[] args) {
		ArrayList<Article> shoppingCart = new ArrayList<>();
		
		DVD item1 = new DVD(4523,25.33,30,"Hulk",COUNTRYCODE.at);
		shoppingCart.add(item1);

		DVD item2 = new DVD(123456,34.99,20,"IronMan",COUNTRYCODE.at);
		shoppingCart.add(item2);
		
	}
}
