  
package Concrete;

import Abstract.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SalesManagement implements SaleManager{

	@Override
	public void buy(Player player, Game game) {
		System.out.println("Id number: " + player.getId() + " " + "Purchased game :" + game.getGameName());
		
	}

	@Override
	public void campaignBuy(Player player, Game game, Campaign campaign) {
		System.out.println("Id number: " + player.getId() + " " + "Purchased game :" + game.getGameName() + "discount rate : " + campaign.getDiscount());
		
	}

	

}