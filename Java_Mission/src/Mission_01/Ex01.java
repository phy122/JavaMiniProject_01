package Mission_01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng,math,java;
		System.out.print("영어 점수 : ");
		eng=sc.nextInt();
		System.out.print("수학 점수 : ");
		math=sc.nextInt();
		System.out.print("자바 점수 : ");
		java=sc.nextInt();
		int result=eng+math+java;
		System.out.println("총점 : "+result);
		System.out.println("평균 : "+(double)result/3);
		sc.close();
	}
}
