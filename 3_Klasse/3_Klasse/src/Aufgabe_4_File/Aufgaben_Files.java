package Aufgabe_4_File;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class Aufgaben_Files {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\marti\\OneDrive\\Bilder\\Screenshots");

		File[] contents = file.listFiles();

		for (int i = 0; i < contents.length; i++) {
			double size = contents[i].length() / 1024;

			long lastModified = contents[i].lastModified();
			Date date = new Date(lastModified);

			String[] p =contents[i].getName().split("\\.");
            String extension = "";
            if (p.length > 1)
            {
                extension = p[p.length-1];
            }
			ausgabe(contents, i, size, date, extension);
		}
		System.out.printf("Amount of Files in the Directory: %d", contents.length);
	}

	private static void ausgabe(File[] contents, int i, double size, Date date, String extension) {
		System.out.printf("Name: %s%n", contents[i].getName());
		System.out.printf("Path: %s%n", contents[i].getAbsolutePath());
		System.out.printf("Extension: %s%n", extension);
		System.out.printf("Date: %s%n", date);
		System.out.printf("Size: %s kb%n", size);
		System.out.println();
		System.out.println();
	}
}
