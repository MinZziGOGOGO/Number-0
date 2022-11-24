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

		// ship nummber 10
		// testing if ship is ok
		int lengthIndex = 9;
		testShip(lengthIndex);
		// crating ship
		Schiffe ship10 = new Schiffe(posX, posY, dir, length[lengthIndex], length[lengthIndex]);

		for (int i = 0; i < ship10.getLength(); i++) {
			if (ship10.isDir()) {
				spielFeld[ship10.getPosX() + i][ship10.getPosY()] = ship10.getIndex();
			} else {
				spielFeld[ship10.getPosX()][ship10.getPosY() + i] = ship10.getIndex();
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
				spielFeld[ship9.getPosX() + i][ship9.getPosY()] = ship9.getIndex();
			} else {
				spielFeld[ship9.getPosX()][ship9.getPosY() + i] = ship9.getIndex();
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
				spielFeld[ship8.getPosX() + i][ship8.getPosY()] = ship8.getIndex();
			} else {
				spielFeld[ship8.getPosX()][ship8.getPosY() + i] = ship8.getIndex();
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
				spielFeld[ship7.getPosX() + i][ship7.getPosY()] = ship7.getIndex();
			} else {
				spielFeld[ship7.getPosX()][ship7.getPosY() + i] = ship7.getIndex();
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
				spielFeld[ship6.getPosX() + i][ship6.getPosY()] = ship6.getIndex();
			} else {
				spielFeld[ship6.getPosX()][ship6.getPosY() + i] = ship6.getIndex();
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
				spielFeld[ship5.getPosX() + i][ship5.getPosY()] = ship5.getIndex();
			} else {
				spielFeld[ship5.getPosX()][ship5.getPosY() + i] = ship5.getIndex();
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
				spielFeld[ship4.getPosX() + i][ship4.getPosY()] = ship4.getIndex();
			} else {
				spielFeld[ship4.getPosX()][ship4.getPosY() + i] = ship4.getIndex();
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
				spielFeld[ship3.getPosX() + i][ship3.getPosY()] = ship3.getIndex();
			} else {
				spielFeld[ship3.getPosX()][ship3.getPosY() + i] = ship3.getIndex();
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
				spielFeld[ship2.getPosX() + i][ship2.getPosY()] = ship2.getIndex();
			} else {
				spielFeld[ship2.getPosX()][ship2.getPosY() + i] = ship2.getIndex();
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
				spielFeld[ship1.getPosX() + i][ship1.getPosY()] = ship1.getIndex();
			} else {
				spielFeld[ship1.getPosX()][ship1.getPosY() + i] = ship1.getIndex();
			}
		}
		showField();
	}

	private static void testShip(int lengthIndex) {
		boolean shipOk = true;
		while (shipOk) {
			createVariables();

			// test if ship is inbounds
			while ((posY > length[lengthIndex] && !dir) || (posX > length[lengthIndex] && dir)) {
				createVariables();
			}

			// test if ship overlaps
			for (int i = 0; i < length[lengthIndex]; i++) {
				if (dir) {
					if (spielFeld[posX + i][posY] == 0) {
						shipOk = false;
					} else {
						shipOk = true;
						break;
					}
				} else {
					if (spielFeld[posX][posY + i] == 0) {
						shipOk = false;
					} else {
						shipOk = true;
						break;
					}
				}
			}

			// test if ship is isolated
//			for (int i = 0; i < length[lengthIndex] + 2; i++) {
//				if (dir) {
//					try {
//						if (spielFeld[posX + i][posY] == 0 && spielFeld[posX + i][posY + 1] == 0
//								&& spielFeld[posX + i][posY - 1] == 0) {
//							shipOk = false;
//							throw new IndexOutOfBoundsException();
//						} else {
//							shipOk = true;
//							break;
//						}
//					} catch (Exception e) {
//						shipOk = false;
//					}
//				} else {
//					try {
//						if (spielFeld[posX][posY + i] == 0 && spielFeld[posX + 1][posY + i] == 0
//								&& spielFeld[posX - 1][posY + i] == 0) {
//							shipOk = false;
//							throw new IndexOutOfBoundsException();
//						} else {
//							shipOk = true;
//							break;
//						}
//					} catch (Exception e) {
//						shipOk = false;
//					}
//				}
//			}
		}
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
