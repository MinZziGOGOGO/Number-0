package Aufgabe_3_Schiffe_Versenken;

public class Schiffe {
	private int posX;
	private int posY;
	private boolean dir;
	private int length;
	private int index;
	
	public Schiffe(int posX, int posY, boolean dir, int length, int index) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
		this.length = length;
		this.index = index;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public boolean isDir() {
		return dir;
	}

	public int getLength() {
		return length;
	}

	public int getIndex() {
		return index;
	}
	
	
}
