package Aufgabe_3_Schiffe_Versenken;

public class SpielFeld {
	static private int[][] spielFeld;
	
	final static int[] length = 	{2,2,2,2,
							 3,3,3,
							 4,4,
							 5};
	static boolean dir;
	static int dirInt;
	static int posX;
	static int posY;
	public static void main(String[] args) {
		baseField();
		
		createVariables();
		Schiffe ship1 = new Schiffe(posX,posY,dir,length[0],length[0]);

		for (int i = 0; i < ship1.getLength(); i++) {
			if(ship1.isDir()) {
				spielFeld[ship1.getPosX() + i][ship1.getPosY()] = ship1.getIndex();
			}else {
				spielFeld[ship1.getPosX()][ship1.getPosY() + i] = ship1.getIndex();
			}
		}
		
		createVariables();
		Schiffe ship2 = new Schiffe(posX,posY,dir,length[7],length[7]);
		
		for (int i = 0; i < ship2.getLength(); i++) {
			if(ship1.isDir()) {
				spielFeld[ship2.getPosX() + i][ship2.getPosY()] = ship2.getIndex();
			}else {
				spielFeld[ship2.getPosX()][ship2.getPosY() + i] = ship2.getIndex();
			}
		}
		showField();
	}

	private static void createVariables() {
		posX = (int)(Math.random()*10);
		posY = (int)(Math.random()*10);
		dirInt = (int)(Math.random()*2);
		if(dirInt == 0) {
			dir = true;
		} else {
			dir = false;
		}
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
