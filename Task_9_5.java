package javaprogramming;

import java.util.Scanner;

public class Task_9_5 {

	public static void main(String[] args) {
		int n;
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the Mark: ");
		n = myobj.nextInt();

		if (n == 100) {
			System.out.println("S Grade");
		} else if (n >= 90) {
			System.out.println("A Grade");
		} else if (n >= 80) {
			System.out.println("B Grade");
		} else if (n >= 70) {
			System.out.println("C Grade");
		} else if (n >= 60) {
			System.out.println("D Grade");
		} else if (n >= 50) {
			System.out.println("E Grade");
		} else {
			System.out.println("F Grade");
		}
	}
}
