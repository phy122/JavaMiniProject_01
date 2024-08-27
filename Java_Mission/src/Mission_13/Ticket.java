package Mission_13;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private List<Game> games;
	
	public Ticket() {
		this.games = new ArrayList<>();
	}
	
	public List<Game> getGames(){
		return games;
	}
	
	public void addGame(Game game) {
		games.add(game);
	}
	
	public void categoryTicket() {
		for (int i = 0; i < games.size(); i++) {
			 System.out.println((char)('A' + i) + "  " + games.get(i).toString());
		}
	}

}
