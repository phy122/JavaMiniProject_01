package Mission_09;

import java.util.Scanner;

class Person {
	String name;
	int bee;
	int money[] = new int[10];

	public Person(String name, int bee) {
		this.name = name;
		this.bee = bee;
	}

}

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person[] = new Person[100];
		int io = 0;
		int cMoney[] = new int[10];
		int one = 50000, cBee;
		boolean mode=true;
		while (true) {
			String name = sc.next();
			if (name.equals("QUIT")) {
				break;
			}
			int Bee = sc.nextInt();
			person[io++] = new Person(name, Bee);
		}
		System.out.println("성명\t출장비\t오만원\t만원\t오천원" + "\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
		for (Person person2 : person) {
			if (person2 == null) {
				break;
			}
			cBee = person2.bee;
			int one_0 = one;
			for (int i = 0; i < cMoney.length; i++) {
				person2.money[i] = cBee / one_0;
				cMoney[i] += person2.money[i];
				cBee = cBee % one_0;
				if (mode) {
					one_0/=5;
				} else {
					one_0/=2;
				}
				mode=!mode;
			}

			System.out.print(person2.name + "\t" + person2.bee + "\t" + person2.money[0] + "\t" + person2.money[1] + "\t"
					+ person2.money[2] + "\t" + person2.money[3] + "\t" + person2.money[4] + "\t" + person2.money[5] + "\t"
					+ person2.money[6] + "\t" + person2.money[7] + "\t" + person2.money[8] + "\t" + person2.money[9]);
			System.out.println();

		}
		System.out.print("전체 화폐매수: " + "\t" + cMoney[0] + "\t" + cMoney[1] + "\t" + cMoney[2] + "\t" + cMoney[3] + "\t"
				+ cMoney[4] + "\t" + cMoney[5] + "\t" + cMoney[6] + "\t" + cMoney[7] + "\t" + cMoney[8] + "\t"
				+ cMoney[9]);

		sc.close();
	}
}
