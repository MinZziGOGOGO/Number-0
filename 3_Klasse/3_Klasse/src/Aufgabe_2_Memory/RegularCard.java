package Aufgabe_2_Memory;

public class RegularCard extends Card {
	private int value;

	public RegularCard(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value + super.toString();
	}
}
