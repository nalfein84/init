package main;

public class Calc {

	public int getNumeral(String string) {
		if (string.equals("I")) return 1;
		else if (string.equals("X")) return 10;
		else if (string.equals("V")) return 5;
		else if (string.equals("C")) return 100;
		else if (string.equals("L")) return 50;
		else if (string.equals("D")) return 500;
		else return 1000;
	}

}
