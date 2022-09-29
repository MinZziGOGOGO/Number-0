package Aufgabe_1;

public class Book extends Article {
	final double vat = 0.07;
	
	private String author;
	private String title;
	private int year;
	
	public Book(double articleNumber, double price, String author, String title, int year) {
		super(articleNumber, price);
		this.author = author;
		this.title = title;
		this.year = year;
	}
	
	public double getPrice() {
		return super.getPrice() * (1 + vat);
	}
}
