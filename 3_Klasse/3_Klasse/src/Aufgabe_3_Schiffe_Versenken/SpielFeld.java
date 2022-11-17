package Aufgabe_3_Schiffe_Versenken;

public class SpielFeld {
	static private int[][] spielFeld;

	final static int[] length = { 2, 2, 2, 2, 3, 3, 3, 4, 4, 5 };
	static boolean dir;
	static int dirInt;
	static int posX;
	static int posY;

	public static void main(String[] args) {
		baseField();

		// ship nummber 9
		// testing if ship is ok
		boolean shipOk = true;
		while(shipOk) {
			createVariables();
			while (posY > length[8] && !dir) {
				createVariables();
			}
			while (posX > length[8] && dir) {
				createVariables();
			}
			
			
			
			
			// geht nicht
//			for (int i = 0; i < length[8]; i++) {
//				if (dir) {
//					if(spielFeld[posX + i][posY] == 0) {
//						shipOk = true;
//					}else {
//						shipOk = false;
//						break;
//					}
//				} else {
//					if(spielFeld[posX][posY + i] == 0) {
//						shipOk = true;
//					}else {
//						shipOk = false;
//						break;
//					}
//				}
//			}
//			shipOk = false;
		}
		// crating ship
		Schiffe ship9 = new Schiffe(posX, posY, dir, length[8], length[8]);

		for (int i = 0; i < ship9.getLength(); i++) {
			if (ship9.isDir()) {
				spielFeld[ship9.getPosX() + i][ship9.getPosY()] = ship9.getIndex();
			} else {
				spielFeld[ship9.getPosX()][ship9.getPosY() + i] = ship9.getIndex();
			}
		}

		showField();
	}

	private static void createVariables() {
		posX = (int) (Math.random() * 10);
		posY = (int) (Math.random() * 10);
		dirInt = (int) (Math.random() * 3);
		if (dirInt == 0) {
			dir = true;
		} else {
			dir = false;
		}
	}

	private static void showField() {
		for (int i = 0; i < spielFeld.length; i++) {
			for (int j = 0; j < spielFeld[i].length; j++) {
				System.out.printf(" %d", spielFeld[i][j]);
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
