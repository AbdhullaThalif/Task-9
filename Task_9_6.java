package javaprogramming;

import java.util.Scanner;

public class Task_9_6 {

	public static void main(String[] args) {

		int month, n;
		float x;
		String y, z;
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the month: ");
		month = myobj.nextInt();
		Scanner myobj2 = new Scanner(System.in);
		System.out.println("Enter the Room Rent Per Day: ");
		x = myobj2.nextFloat();
		Scanner myobj1 = new Scanner(System.in);
		System.out.println("Enter the Days: ");
		n = myobj1.nextInt();
		y = String.format("%.2f", x * n);
		z = String.format("%.2f", ((x + (x * 0.20)) * n));
		switch (month) {
		case 1:
			System.out.println(y);
			break;
		case 2:
			System.out.println(y);
			break;
		case 3:
			System.out.println(y);
			break;
		case 4:
			System.out.println(z);
			break;
		case 5:
			System.out.println(z);
			break;
		case 6:
			System.out.println(z);
			break;
		case 7:
			System.out.println(y);
			break;
		case 8:
			System.out.println(y);
			break;
		case 9:
			System.out.println(y);
			break;
		case 10:
			System.out.println(y);
			break;
		case 11:
			System.out.println(z);
			break;
		case 12:
			System.out.println(z);
			break;
		}

	}

}
