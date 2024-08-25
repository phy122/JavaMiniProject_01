package Mission_13;

import java.util.Arrays;

public class Game {
	private int[] numbers;

	public Game(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return (numbers.length == 6 ? "자 동 " : "수 동 ") + Arrays.toString(numbers)
        .replaceAll(",", "")
        .replace("[", "")
        .replace("]", "")
        .trim();
	}
	
	
	
	

}
