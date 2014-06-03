package logic;


public class GoToJail extends Space {

	public GoToJail(){
		
	}
	
	@Override
	public void Action(Player p) {
		p.setPosition(10);
		p.setPrevious_position(30);
		p.setArested_time(3);
	}

	@Override
	public boolean getMortgage() {
		return false;
	}

}
