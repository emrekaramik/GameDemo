package Abstract;import Entities.Campaign;
import Entities.Game;
import Entities.Player;


public interface SaleManager {
	
	void buy(Player player, Game game);
	
	void campaignBuy(Player player, Game game, Campaign campaign);
	

}