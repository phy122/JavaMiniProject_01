package Mission_13;

import java.util.Arrays;

public class Game {
	private int[] numbers;
	private boolean isAuto;

	public Game(int[] numbers, boolean isAuto) {
		this.numbers = numbers;
		this.isAuto = isAuto;
	}

	public int[] getNumbers() {
		return numbers;
	}
	
	public boolean isAuto() {
        return isAuto;
    }

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	 public void setAuto(boolean isAuto) {
	        this.isAuto = isAuto;
	    }

	@Override
	public String toString() {
		String gameType = isAuto ? "자 동 " : "수 동 ";
		return gameType + Arrays.toString(numbers)
        .replaceAll(",", "")
        .replace("[", "")
        .replace("]", "")
        .trim();
	}
	
	
	
	

}
