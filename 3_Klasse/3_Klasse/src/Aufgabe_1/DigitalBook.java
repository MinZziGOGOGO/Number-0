package Aufgabe_1;

public class DigitalBook extends Book {
	private int size;

	public DigitalBook(double articleNumber, double price, String author, String title, int year, int size) {
		super(articleNumber, price, author, title, year);
		this.size = size;
	}
}
