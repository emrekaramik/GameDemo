package Concrete;

import Abstract.PlayerCheckService;
import Abstract.PlayerManager;
import Entities.Player;

public class PlayerManagement implements PlayerManager {
	
	private PlayerCheckService playerCheckService;
	
	
	public PlayerManagement(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	
	@Override
	public void save(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Successfully registiration " + player.getFirstName());
			
		}else {
			System.out.println("Invalid registiration");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Successfully deleted" + player.getFirstName());
		
	}

	@Override
	public void update(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Successfully updated " + player.getFirstName());
			
		}else {
			System.out.println("Invalid updated");
		}
		
		
	}

}