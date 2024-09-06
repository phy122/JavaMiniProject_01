package day09.Ex07_Review.인터페이스;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BoardAccess ac = new BoardAccess();
		Board zz = new Board();
		ac.create("제목01", "작성자01", "내용01");
		ac.create("제목02", "작성자02", "내용02");
		ac.create("제목03", "작성자03", "내용03");
		Scanner sc = new Scanner(System.in);

		int menuNo = 0;

		while (true) {
			System.out.println("======대충 메뉴======");
			System.out.println("1. 리스트");
			System.out.println("2. 크리에이티브");
			System.out.println("3. 리드");
			System.out.println("4. 업뎃");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.println("================");
			try {
				menuNo = sc.nextInt();
			} catch (Exception e) {
				System.out.println("입력 제대로");
				sc.nextLine();
				continue;
			}
			if (menuNo == 0) {
				break;
			}
			try {
				switch (menuNo) {
				case 1:
					System.out.println();
					ac.list();
					break;
				case 2:
					String a=sc.next();
					String b=sc.next();
					String c=sc.next();
					ac.create(a, b, c);
					System.out.println();
					ac.list();
					break;
				case 3:
					ac.list();
					System.out.println();
					int d=sc.nextInt();
					ac.read(d);
					break;
				case 4:
					d=sc.nextInt();
					zz=ac.read(d);
					System.out.print("바꿀 내용:");
					sc.nextLine();
					c=sc.nextLine();
					zz.setContent(c);
					ac.update(zz);
					break;
				case 5:
					System.out.print("삭제 번호:");
					d=sc.nextInt();
					ac.delete(d);
					System.out.println();
					ac.list();
					break;
				default:
					System.out.println("입력 제대로");
					break;
				}
			} catch (Exception e) {
				System.out.println("입력 제대로");
				sc.nextLine();
			}

		}
		sc.close();
	}
}
