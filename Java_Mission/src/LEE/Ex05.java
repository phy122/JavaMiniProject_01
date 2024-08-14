package LEE;

import java.util.Scanner;

public class Ex05 {
	static int su=0;
	static Scanner sc = new Scanner(System.in);
	public static int chain() {
		
		System.out.println("****** 치킨 메뉴판 *******");
		System.out.println("1.\t황금올리브 반반한 치킨");
		System.out.println("2.\t뿌링클 치킨");
		System.out.println("3.\t처갓집에서 호식이가 만든 치킨");
		System.out.println("0.\t종료");
		System.out.print("******** 번호 : ");
		int a=sc.nextInt();
		System.out.println();
		String meta = null;
		switch (a) {
		case 0:
			System.out.println("총 "+su+" 개의 상품이 주문되었습니다.");
			return 0;
		case 1:
			meta="'황금올리브 반반한 치킨'";
			su++;
			break;
		case 2:
			meta="'뿌잉클 치킨'";
			su++;
			break;
		case 3:
			meta="'처갓집에서 호식이가 만든 치킨'";
			su++;
			break;
		default:
			System.out.println("(0~3) 사이의 번호를 입력해주세요.");
			System.out.println();
			return 1;
		}
		System.out.println(meta+"이(/가)주문되었습니다.");
		System.out.println();
		System.out.println();
		return 1;
	}
	
	public static void main(String[] args) {
		
		int lop;
		do {
			lop=chain();
		}while(lop==1);
		
		sc.close();
	}
}
