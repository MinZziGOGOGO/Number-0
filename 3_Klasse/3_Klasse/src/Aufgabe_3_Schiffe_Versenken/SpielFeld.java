package Aufgabe_3_Schiffe_Versenken;

public class SpielFeld {
	static private int[][] spielFeld;
	
	final static int[] length = 	{2,2,2,2,
							 3,3,3,
							 4,4,
							 5};
	
	public static void main(String[] args) {
		baseField();
		
		int posX = (int)(Math.random()*10);
		int posY = (int)(Math.random()*10);
		Schiffe k = new Schiffe(posX,posY,true,1,length[1]);
		
		for (int i = 0; i < k.getLength(); i++) {
			if(k.isDir()) {
				spielFeld[k.getPosX() + i][k.getPosY()] = k.getIndex();
			}else {
				spielFeld[k.getPosX()][k.getPosY() + i] = k.getIndex();
			}
		}
		showField();
	}



	private static void showField() {
		for (int i = 0; i < spielFeld.length; i++) {
			for (int j = 0; j < spielFeld[i].length; j++) {
				System.out.printf(" %d",spielFeld[i][j]);
			}
			System.out.println();
		}
	}

	
	
	private static void baseField() {
		spielFeld = new int[10][10]; 
		for (int i = 0; i < spielFeld.length; i++) {
			for (int j = 0; j < spielFeld[i].length; j++) {
				spielFeld[i][j] = 0;
			}
		}
	}
}
