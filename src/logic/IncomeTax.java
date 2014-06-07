package logic;


public class IncomeTax extends Space {

	public IncomeTax(){
		
	}
	
	@Override
	public void Action(Player p) {
		//player can either pay 200$ or 10% of his worth
		int rent = (int) 0.1*p.getWorth();
		if(rent > 200){
			p.removeMoney(200);
		}else{
			p.removeMoney(rent);
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
