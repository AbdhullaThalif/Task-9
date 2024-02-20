package javaprogramming;

public class Task_9_7 {
	public static void main(String[] args) {

		int n1 = 88, n2 = 68, n3 = 128;

		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + " is Largest Number");
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println(n2 + " is Largest Number");
		} else {
			System.out.println(n3 + " is Largest Number");
		}
	}

}
