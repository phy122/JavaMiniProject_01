package LEE;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int b = a;
		int b1 = b;
		int b2 = b - 1;

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < b1 - b2; j++) {
				System.out.print("*");
			}
			b1++;
			b2--;
			System.out.println();
		}
		sc.close();
	}
}

// for (int i = 0; i < b; i++) {
// int b3=b2;
// for (int j = 0; j <b1 ; j++) {
//		if(b3>0) {
//			System.out.print(" ");
//			b3--;
//		}
//		else {
//			System.out.print("*");
//		}
// }
// b1++;
// b2--;
// System.out.println();
// }
