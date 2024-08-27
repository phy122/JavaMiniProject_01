package Mission_13;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LottoFunction function = LottoFunction.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		Ticket ticket = new Ticket();
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("몇 게임? ");
        int numberOfGames = scanner.nextInt();
        scanner.nextLine(); 
        
        if(numberOfGames > 5) {
        	System.out.println("게임 수는 최대 5게임 입니다.");
        	numberOfGames = 5;
        }
       
        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("[" + (i + 1) + " 게임] (1.자동 / 2.수동) : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) { 
            	 int[] autoNumbers = function.RandomNumbers();
                ticket.addGame(new Game(function.RandomNumbers(),true));
                System.out.println(Arrays.toString(autoNumbers).replaceAll(",", "").replace("[", "").replace("]", ""));
            } else if (choice == 2) {
            	int[] manualNumbers = new int[6];
                for (int j = 0; j < 6; j++) {
                    int number;
                    do {
                        System.out.print((j + 1) + " : ");
                        number = scanner.nextInt();
                        if (number < 1 || number > 45) {
                            System.out.println("1부터 45 사이의 숫자를 입력하세요.");
                        }
                    } while (number < 1 || number > 45);
                    manualNumbers[j] = number;
                }
                ticket.addGame(new Game(manualNumbers,false));
            }
        }
     // 로또 티켓 출력
        
        System.out.println("############ 인생역전 Lottoria ############");
        System.out.println("발행일 : " + sdf.format(function.getLottoDate()));
        System.out.println("추첨일 : " + sdf.format(function.getDrawingDate()));
        System.out.println("지급기한 : " + sdf.format(function.getPaymentDate()));
        System.out.println("-----------------------------------------");
        ticket.categoryTicket();
        
        // 금액 계산 및 출력
        int totalCost = numberOfGames * 1000;
        System.out.println("-----------------------------------------");
        System.out.println("금액                              ₩" + totalCost);

        // 당첨 결과 확인
        System.out.println("-----------------------------------------");
        System.out.println("당첨 번호 : " + Arrays.toString(function.getWinningNumber()));
        System.out.println("보너스 번호 : " + function.getBonusNumber());
        function.winningCheck(ticket);
	}

}
