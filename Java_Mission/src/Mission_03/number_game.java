package Mission_03;

public class number_game {

    public static void main(String[] args) {
        
    	for (int i = 1; i <= 100; i++) {
    		int count = 0;
			int x = i / 10;
			int y = i % 10;
			
			if(x == 3 || x == 6 || x == 9) {
				count++;
			}
			if(y == 3 || y == 6 || y == 9) {
				count++;
			}
			if(count == 2) {
				System.out.println("**");
			}else if(count == 1) {
				System.out.println("*");
			}else {
				System.out.println(i + " ");
			}
		}
    }
}



