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
       
        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("[" + (i + 1) + " 게임] (1.자동 / 2.수동) : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) { 
                ticket.addGame(new Game(function.RandomNumbers()));
            } else if (choice == 2) {
            	
                int[] manualNumbers = new int[6];
                for (int j = 0; j < 6; j++) {
                    System.out.print((j + 1) + " : ");
                    manualNumbers[j] = scanner.nextInt();
                }
                ticket.addGame(new Game(manualNumbers));
            }
        }
     // 로또 티켓 출력
        
        System.out.println("############ 인생역전 Lottoria ############");
        System.out.println("발행일 : " + sdf.format(function.getLottoDate()));
        System.out.println("추첨일 : " + sdf.format(function.getDrawingDate()));
        System.out.println("지급기한 : " + sdf.format(function.getPaymentDate()));
        System.out.println("-----------------------------------------");
        ticket.categoryTicket();

        // 당첨 결과 확인
        System.out.println("-----------------------------------------");
        System.out.println("당첨 번호 : " + Arrays.toString(function.getWinningNumber()));
        System.out.println("보너스 번호 : " + function.getBonusNumber());
        function.winningCheck(ticket);
	}

}
