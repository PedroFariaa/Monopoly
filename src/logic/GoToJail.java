package logic;


public class GoToJail extends Space {

	@Override
	public void Action(Player p) {
		p.setPosition(10);
		p.setPrevious_position(30);
		p.setArested_time(3);
	}

}
