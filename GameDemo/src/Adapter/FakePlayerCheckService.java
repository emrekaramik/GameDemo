  
package Adapter;

import Abstract.PlayerCheckService;
import Entities.Player;

public class FakePlayerCheckService implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		return true;
	}
	

}