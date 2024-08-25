package Mission_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class SortScores {

	public static void main(String[] args) throws IOException {
		List<String[]> people = new ArrayList<>();
		String filePath = "C:\\KIMDO/234234.txt";

		// 파일 읽기
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		String line;
		while ((line = br.readLine()) != null) {
			String[] parts = line.split("/");
					
			if (parts.length == 4) {
				people.add(parts); // 배열 자체를 리스트에 추가
			}
		}
		// 점수 내림차순 정렬
		for (int i = 0; i < people.size() - 1; i++) {
			for (int j = 0; j < people.size() - 1; j++) {
				if (Integer.parseInt(people.get(j)[2]) < Integer.parseInt(people.get(j + 1)[2])) {
					String[] temp = people.get(j);
					people.set(j, people.get(j + 1));
					people.set(j + 1, temp);
				}

			}

		}
		// 정렬된 결과 출력
		System.out.println("점수 내림차순 정렬:");
		for (String[] score : people) {
			System.out.println(String.join("/", score));

		}
	}
}