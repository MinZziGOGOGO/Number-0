package Aufgabe_1;

public class DVD extends Article {
	final double vat = 0.19;
	enum COUNTRYCODE {de, at;};
	
	private String name;
	private int duration;
	private COUNTRYCODE countryCode;
	
	
	
	public DVD(double articleNumber, double price, int duration, String name, COUNTRYCODE countryCode) {
		super(articleNumber, price);
		this.name = name;
		this.duration = duration;
		this.countryCode = countryCode;
	}
}
