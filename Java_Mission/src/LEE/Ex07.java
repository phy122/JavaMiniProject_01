package LEE;

// 퀵 정렬 클래스
class Quickst {
	private static void swap(int a[], int b, int c) {
		int temp;
		temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}

	public void sort(int a[], boolean sw) {
		if (sw) {
			m_pivot_sort(a, 0, a.length - 1,true);
		} else {
			m_pivot_sort(a, 0, a.length - 1,false);
		}
	}

	private static int partition(int[] a, int left, int right,boolean sw) {
		int lo = left - 1;
		int hi = right + 1;
		int pivot = (left + right) / 2; // 부분리스트의 중간 요소를 피벗으로 설정
		
		while (true) {
			if(sw) {
				do {
					lo++;
				} while (a[lo] < a[pivot]);

				do {
					hi--;
				} while (a[hi] > a[pivot] && lo <= hi);
			}
			else {
				do {
					lo++;
				} while (a[lo] > a[pivot]);

				do {
					hi--;
				} while (a[hi] < a[pivot] && lo <= hi);
			}
			

			if (lo >= hi)
				return hi;

			swap(a, lo, hi);
		}
	}

	private static void m_pivot_sort(int a[], int lo, int hi,boolean sw) {

		// 처음 들어오는 게 0, 마지막
		if (lo >= hi)
			return;
		if(sw) {
			int pivot = partition(a, lo, hi,true);
			m_pivot_sort(a, lo, pivot,true);
			m_pivot_sort(a, pivot + 1, hi,true);
		}
		else {
			int pivot = partition(a, lo, hi,false);
			m_pivot_sort(a, lo, pivot,false);
			m_pivot_sort(a, pivot + 1, hi,false);
		}
		
	}

}

public class Ex07 {
	public static void main(String[] args) {
		int a[] = { 55, 15, 16, 48, -151, 100 };
		Quickst quickst = new Quickst();
		quickst.sort(a, true);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		quickst.sort(a, false);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
