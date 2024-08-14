package LEE;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	public static void roto(int hi) {
		Random random = new Random();
		int a[]=new int[6];
		int hi_0=1;
		while(hi+1 != hi_0) {
			for (int i = 0; i < a.length; i++) {
				a[i]=random.nextInt(45)+1;
				for (int j = 0; j < i; j++) {
					if(a[j]==a[i]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(a);
			System.out.print("["+hi_0+"게임]: ");
			for (int i : a) {
				System.out.print(i+" ");
			}
			System.out.println();
			hi_0++;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?: ");
		roto(sc.nextInt());
		sc.close();
	}
}
