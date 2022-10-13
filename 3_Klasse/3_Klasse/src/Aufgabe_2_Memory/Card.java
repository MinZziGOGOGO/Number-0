package Aufgabe_2_Memory;

public class Card {
	protected boolean visible;
	
	@Override
	public String toString() {
		if(visible) return "_";
		return "*";
	}
}
