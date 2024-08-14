package LEE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex12 {

	public static void roto(int hi) {
		Random random = new Random();
		ArrayList<Integer> a = new ArrayList<>();
		int hi_0 = 1;
		while (hi + 1 != hi_0) {
			for (int i = 0; i < 6; i++) {
				a.add(i,random.nextInt(45) + 1);
				for (int j = 0; j < i; j++) {
					if (a.get(j) == a.get(i)) {
						a.remove(i);
						i--;
						continue;
					}
				}
			}
			System.out.print("[" + hi_0 + "게임]: ");
			Collections.sort(a);
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
			a.clear();
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

