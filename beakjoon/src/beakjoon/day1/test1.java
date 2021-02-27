package beakjoon.day1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("A값 입력: ");
		int A = scn.nextInt();
		System.out.print("B값 입력: ");
		int B = scn.nextInt();
		while (0 < A && B<10) {
			System.out.println("결과: " +(A + B));
			break;
		}

	}// end of main
}// end of class
