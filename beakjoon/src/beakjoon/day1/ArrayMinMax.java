package beakjoon.day1;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] s = new int[n];
		int max = s[0];
		int min = s[0];

		for (int i = 0; i < s.length; i++) {
			s[i] = scn.nextInt();
			if (i == 0) {
				min = s[i];
			} else if (max < s[i])
				max = s[i];
			else if (min > s[i])
				min = s[i];
		}
		System.out.println(min + " " + max);
	}// end of main
}// end of class
