package Aufgabe_1;

public class Article {
	private double articleNumber;
	private double price;
	
	public Article(double articleNumber, double price) {
		this.articleNumber = articleNumber;
		this.price = price;
		System.out.println();
	}

	public double getPrice() {
		return price;
	}
}
