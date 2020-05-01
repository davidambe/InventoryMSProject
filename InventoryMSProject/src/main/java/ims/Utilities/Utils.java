package ims.Utilities;

import java.util.Scanner;

public class Utils {

	public static final String MYSQL = "jdbc:mysql://localhost:3306/InventoryMStest?useSSL=false";
	public static final Scanner scanner = new Scanner(System.in);

	private Utils() {

	}

	public static String getUserInput() {
		return scanner.nextLine();

	}
	public static int getIntInput() {
		return scanner.nextInt();
	}

}
