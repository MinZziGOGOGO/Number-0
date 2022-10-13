package Aufgabe_2_Memory;

import javax.smartcardio.Card;

public class Playground {
	private Card[][] cards;
	private int whosOnTurn;
	private int[] score;
	private int nrJoker;
	private int nrPairs;
	
	public Playground(int whosOnTurn, int nrJoker, int nrPairs) {
		super();
		this.whosOnTurn = whosOnTurn;
		this.nrJoker = nrJoker;
		this.nrPairs = nrPairs;
	}
	
	
}
