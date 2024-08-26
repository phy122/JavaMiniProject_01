package Mission_13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class LottoFunction {
	private int[] winningNumber;
	private int bonusNumber;
	private Date lottoDate;		//발행날짜
	private Date drawingDate;	//추첨날짜
	private Date paymentDate;	//지급날짜
	
	private static LottoFunction instance;

	private LottoFunction() {
		this.winningNumber = gameWinningNumber();
        this.bonusNumber = gameBonusNumber(winningNumber);
        this.lottoDate = new Date();
        this.drawingDate = caldrawingDate(lottoDate);
        this.paymentDate = calpaymentDate(lottoDate);
	}
	
	public static LottoFunction getInstance() {
		if(instance == null) {
			instance = new LottoFunction();
		}
		return instance;
	}

	public int[] getWinningNumber() {
		return winningNumber;
	}
	
	public int getBonusNumber() {
		return bonusNumber;
	}

	public Date getLottoDate() {
		return lottoDate;
	}

	public Date getDrawingDate() {
		return drawingDate;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}
	
	private int[] gameWinningNumber() {
        return RandomNumbers();
    }
	
	private int gameBonusNumber(int[] winningNumbers) {
        int bonus;
        do {
            bonus = (int) (Math.random() * 45) + 1;
        } while (contains(winningNumbers, bonus));
        return bonus;
    }
	
	public int[] RandomNumbers() {
	    List<Integer> numbers = new ArrayList<>();
	    for (int i = 1; i <= 45; i++) {
	        numbers.add(i); 
	    }

	    int[] result = new int[6];
	    Random rand = new Random();
	    for (int i = 0; i < 6; i++) {
	        int index = rand.nextInt(numbers.size());  
	        result[i] = numbers.remove(index);  
	    }
	    return result;
	}

	private boolean contains(int[] array, int value) {
		for (int i : array) {
			if(i == value) {
				return true;
			}
		}
		return false;
	}
	
	private Date caldrawingDate(Date lottoDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(lottoDate);
		calendar.set(calendar.DAY_OF_WEEK, calendar.SATURDAY);
		calendar.set(calendar.HOUR_OF_DAY, 21);
		calendar.set(calendar.MINUTE, 0);
		calendar.set(calendar.SECOND, 0);
		if(lottoDate.after(calendar.getTime())) {
			calendar.add(calendar.WEEK_OF_YEAR,1);
		}
		return calendar.getTime();
	}
	
	private Date calpaymentDate(Date lottoDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(lottoDate);
		calendar.add(calendar.YEAR, 1);
		calendar.add(calendar.DAY_OF_YEAR, 1);
		return calendar.getTime();
	}
	
	public void winningCheck(Ticket ticket) {
		System.out.println("#################### 당첨 결과 ####################");
        for (int i = 0; i < ticket.getGames().size(); i++) {
            Game game = ticket.getGames().get(i);
            int count = countMatch(game.getNumbers(), winningNumber);
            boolean bonusMatch = contains(game.getNumbers(), bonusNumber);
            int rank = determineRank(count, bonusMatch);
            String result = (rank == 0) ? "낙첨" : rank + "등";
            System.out.println((char)('A' + i) + " " + game.toString() + " (" + result + ")");
        }
        System.out.println("#################################################");
	}
	
	private int countMatch(int[] game, int[] winningNumber) {
		int count = 0;
		for (int num : game) {
			if(contains(winningNumber, num)) {
				count++;
			}
		}
		return count;
	}
	
	private int determineRank(int matchCount, boolean bonusMatch) {
        if (matchCount == 6) return 1;
        if (matchCount == 5 && bonusMatch) return 2;
        if (matchCount == 5) return 3;
        if (matchCount == 4) return 4;
        if (matchCount == 3) return 5;
        return 0;
    }
}
