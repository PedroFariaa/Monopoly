package logic;


public class IncomeTax extends Space {

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

}
