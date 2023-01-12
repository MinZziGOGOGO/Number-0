package Aufgabe_3_Schiffe_Versenken;

public class SpielFeld {
	public int[][] Spielfeld;
	
	public void init() {
		basisFeld();
		// ship nummber 10
		// testing if ship is ok
		int lengthIndex = 9;
		testShip(lengthIndex);
		// crating ship
		Schiffe ship10 = new Schiffe(posX, posY, dir, length[lengthIndex], length[lengthIndex]);

		for (int i = 0; i < ship10.getLength(); i++) {
			if (ship10.isDir()) {
				Spielfeld[ship10.getPosX() + i][ship10.getPosY()] = ship10.getIndex();
			} else {
				Spielfeld[ship10.getPosX()][ship10.getPosY() + i] = ship10.getIndex();
			}
		}

		// ship nummber 9
		// testing if ship is ok
		int lengthIndex1 = 8;
		testShip(lengthIndex1);
		// crating ship
		Schiffe ship9 = new Schiffe(posX, posY, dir, length[lengthIndex1], length[lengthIndex1]);

		for (int i = 0; i < ship9.getLength(); i++) {
			if (ship9.isDir()) {
				Spielfeld[ship9.getPosX() + i][ship9.getPosY()] = ship9.getIndex();
			} else {
				Spielfeld[ship9.getPosX()][ship9.getPosY() + i] = ship9.getIndex();
			}
		}

		// ship nummber 8
		// testing if ship is ok
		int lengthIndex2 = 7;
		testShip(lengthIndex2);
		// crating ship
		Schiffe ship8 = new Schiffe(posX, posY, dir, length[lengthIndex2], length[lengthIndex2]);

		for (int i = 0; i < ship8.getLength(); i++) {
			if (ship8.isDir()) {
				Spielfeld[ship8.getPosX() + i][ship8.getPosY()] = ship8.getIndex();
			} else {
				Spielfeld[ship8.getPosX()][ship8.getPosY() + i] = ship8.getIndex();
			}
		}

		// ship nummber 7
		// testing if ship is ok
		int lengthIndex3 = 6;
		testShip(lengthIndex3);
		// crating ship
		Schiffe ship7 = new Schiffe(posX, posY, dir, length[lengthIndex3], length[lengthIndex3]);

		for (int i = 0; i < ship7.getLength(); i++) {
			if (ship7.isDir()) {
				Spielfeld[ship7.getPosX() + i][ship7.getPosY()] = ship7.getIndex();
			} else {
				Spielfeld[ship7.getPosX()][ship7.getPosY() + i] = ship7.getIndex();
			}
		}

		// ship nummber 6
		// testing if ship is ok
		int lengthIndex4 = 5;
		testShip(lengthIndex4);
		// crating ship
		Schiffe ship6 = new Schiffe(posX, posY, dir, length[lengthIndex4], length[lengthIndex4]);

		for (int i = 0; i < ship6.getLength(); i++) {
			if (ship6.isDir()) {
				Spielfeld[ship6.getPosX() + i][ship6.getPosY()] = ship6.getIndex();
			} else {
				Spielfeld[ship6.getPosX()][ship6.getPosY() + i] = ship6.getIndex();
			}
		}

		// ship nummber 5
		// testing if ship is ok
		int lengthIndex5 = 4;
		testShip(lengthIndex5);
		// crating ship
		Schiffe ship5 = new Schiffe(posX, posY, dir, length[lengthIndex5], length[lengthIndex5]);

		for (int i = 0; i < ship5.getLength(); i++) {
			if (ship5.isDir()) {
				Spielfeld[ship5.getPosX() + i][ship5.getPosY()] = ship5.getIndex();
			} else {
				Spielfeld[ship5.getPosX()][ship5.getPosY() + i] = ship5.getIndex();
			}
		}

		// ship nummber 4
		// testing if ship is ok
		int lengthIndex6 = 3;
		testShip(lengthIndex6);
		// crating ship
		Schiffe ship4 = new Schiffe(posX, posY, dir, length[lengthIndex6], length[lengthIndex6]);

		for (int i = 0; i < ship4.getLength(); i++) {
			if (ship4.isDir()) {
				Spielfeld[ship4.getPosX() + i][ship4.getPosY()] = ship4.getIndex();
			} else {
				Spielfeld[ship4.getPosX()][ship4.getPosY() + i] = ship4.getIndex();
			}
		}

		// ship nummber 3
		// testing if ship is ok
		int lengthIndex7 = 2;
		testShip(lengthIndex7);
		// crating ship
		Schiffe ship3 = new Schiffe(posX, posY, dir, length[lengthIndex7], length[lengthIndex7]);

		for (int i = 0; i < ship3.getLength(); i++) {
			if (ship3.isDir()) {
				Spielfeld[ship3.getPosX() + i][ship3.getPosY()] = ship3.getIndex();
			} else {
				Spielfeld[ship3.getPosX()][ship3.getPosY() + i] = ship3.getIndex();
			}
		}

		// ship nummber 2
		// testing if ship is ok
		int lengthIndex8 = 1;
		testShip(lengthIndex8);
		// crating ship
		Schiffe ship2 = new Schiffe(posX, posY, dir, length[lengthIndex8], length[lengthIndex8]);

		for (int i = 0; i < ship2.getLength(); i++) {
			if (ship2.isDir()) {
				Spielfeld[ship2.getPosX() + i][ship2.getPosY()] = ship2.getIndex();
			} else {
				Spielfeld[ship2.getPosX()][ship2.getPosY() + i] = ship2.getIndex();
			}
		}

		// ship nummber 1
		// testing if ship is ok
		int lengthIndex9 = 0;
		testShip(lengthIndex9);
		// crating ship
		Schiffe ship1 = new Schiffe(posX, posY, dir, length[lengthIndex9], length[lengthIndex9]);

		for (int i = 0; i < ship1.getLength(); i++) {
			if (ship1.isDir()) {
				Spielfeld[ship1.getPosX() + i][ship1.getPosY()] = ship1.getIndex();
			} else {
				Spielfeld[ship1.getPosX()][ship1.getPosY() + i] = ship1.getIndex();
			}
		}
	}

	final static int[] length = { 2, 2, 2, 2, 3, 3, 3, 4, 4, 5 };
	static boolean dir;
	static int dirInt;
	static int posX;
	static int posY;

	
	public static void main(String[] args) {
		SpielFeld s = new SpielFeld();
		s.init();
		s.showFeld();
	}

	private  void testShip(int lengthIndex) {
		boolean passtSchiff = true;
		while (passtSchiff) {
			Schiffferstellen();

			// test if ship is inbounds
			while ((posY > length[lengthIndex] && !dir) || (posX > length[lengthIndex] && dir)) {
				Schiffferstellen();
			}

			// test if ship overlaps
			for (int i = 0; i < length[lengthIndex]; i++) {
				if (dir) {
					if (Spielfeld[posX + i][posY] == 0) {
						passtSchiff = false;
					} else {
						passtSchiff = true;
						break;
					}
				} else {
					if (Spielfeld[posX][posY + i] == 0) {
						passtSchiff = false;
					} else {
						passtSchiff = true;
						break;
					}
				}
			}
		}
	}

	private  void Schiffferstellen() {
		posX = (int) (Math.random() * 10);
		posY = (int) (Math.random() * 10);
		dirInt = (int) (Math.random() * 3);
		if (dirInt == 0) {
			dir = true;
		} else {
			dir = false;
		}
	}

	private  void showFeld() {
		for (int i = 0; i < Spielfeld.length; i++) {
			for (int j = 0; j < Spielfeld[i].length; j++) {
				System.out.printf(" %d", Spielfeld[i][j]);
			}
			System.out.println();
		}
	}

	private  void basisFeld() {
		Spielfeld = new int[10][10];
		for (int i = 0; i < Spielfeld.length; i++) {
			for (int j = 0; j < Spielfeld[i].length; j++) {
				Spielfeld[i][j] = 0;
			}
		}
	}
}
