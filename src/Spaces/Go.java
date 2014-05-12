package Spaces;

import logic.Player;
import logic.Space;

public class Go extends Space {

	@Override
	public void Action(Player p) {
		p.addMoney(200);
	}

}
