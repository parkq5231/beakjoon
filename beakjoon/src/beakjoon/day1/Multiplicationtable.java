package beakjoon.day1;

import java.util.Scanner;

public class Multiplicationtable {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(N + "*" + i + "=" + (N * i));
		}
	}// end of main
}// end of class
