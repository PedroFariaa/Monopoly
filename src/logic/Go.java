package logic;


public class Go extends Space {
	public Go(){
	}
	
	@Override
	public void Action(Player p) {
		if(p.getPrevious_position() > p.getPosition()){
			p.addMoney(200);
		}
	}

	@Override
	public boolean getMortgage() {
		return false;
	}

	@Override
	public void Buy(Player p) {
		// TODO Auto-generated method stub
		
	}

}
