package Entities;
import java.sql.Date;

import Adapter.FakePlayerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManagement;
import Concrete.GameManagement;
import Concrete.PlayerManagement;
import Concrete.SalesManagement;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1, "League of legends", 400);
		Game game2 = new Game(2, "Pubg", 500);
		
		GameManagement gameManagement = new GameManagement();
		gameManagement.add(game1);
		
		@SuppressWarnings("deprecation")
		Player player = new Player(1, "Emre", "Karamik", new Date(1994, 5, 27), "2219");
		PlayerManagement playerManagement = new PlayerManagement(new MernisServiceAdapter());
		playerManagement.save(player);
		playerManagement.delete(player);
		
		Campaign campaign = new Campaign(1,"Summer Campaign", 50);
		CampaignManagement campaignManagement = new CampaignManagement();
		campaignManagement.add(campaign);
		
		SalesManagement salesManagement = new SalesManagement();
		salesManagement.buy(player, game1);
		salesManagement.buy(player, game2);

	}

}