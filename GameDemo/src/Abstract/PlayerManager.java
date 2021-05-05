  
package Abstract;

import Entities.Player;

public interface PlayerManager {
	
	void save(Player gamer);
	void delete(Player gamer);
	void update(Player gamer);

}