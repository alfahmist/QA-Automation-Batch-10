import java.util.Scanner;

class Calculator {

	private int userInput = 0;
	private int value1 = 0;
	private int value2 = 0;
	private int hasil = 0;

	private String operator = "";

	void run() {

		userInput = menuOption();

		switch (userInput) {
		case 1:
			penambahan();
			break;
		case 2:
			pengurangan();
			break;
		case 3:
			perkalian();
			break;
		case 4:
			pembagian();
			break;
		default:
			printError("Harap pilih menu 1 s/d 4");
			run();
			break;
		}
	}
	void inputAngka() {
		try {
			Scanner inputValue1 = new Scanner(System.in);
			Scanner inputValue2 = new Scanner(System.in);
			System.out.print("Masukkan Angka pertama : ");
			String scan1 = inputValue1.next();
			System.out.print("Masukkan Angka Kedua : ");
			String scan2 = inputValue2.next();
			value1 = Integer.parseInt(scan1);
			value2 = Integer.parseInt(scan2);
		} catch (Exception e) {
			printError("Tidak bisa input string\n");
			inputAngka();
		}
	}

	void penambahan() {
		inputAngka();
		hasil = value1 + value2;
		operator = "+";
		printHasil();
	}

	void pengurangan() {
		inputAngka();
		hasil = value1 - value2;
		operator = "-";
		printHasil();
	}

	void perkalian() {
		inputAngka();
		hasil = value1 * value2;
		operator = "x";
		printHasil();
	}

	void pembagian() {
		inputAngka();
		hasil = value1 / value2;
		operator = ":";
		printHasil();
	}

	void printError(String message) {
		System.err.println(message);
	}

	private void printHasil() {
		System.out.printf("Hasil : %d %s %d = %d%n", value1, operator, value2, hasil);
	}

	@SuppressWarnings("resource")
	int menuOption() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Penambahan");
			System.out.println("2. Pengurangan");
			System.out.println("3. Perkalian");
			System.out.println("4. Pembagian");
			System.out.print("Pilih Menu 1 s/d 4 : ");

			userInput = sc.nextInt();

			System.out.println();
		} catch (Exception e) {
			System.err.println("Masukkan angka 1 s/d 4\n");
			// Rekursif
			return menuOption();
		}
		return userInput;
	} 
}
