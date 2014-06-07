package logic;

public class Community extends Space {
	private int lastCard;
	
	@Override
	public void Action(Player p) {
		// TODO Auto-generated method stub
		int randomNum = (int)(Math.random()*5); 
		if(randomNum==0){
			p.setPosition(1);
		}else if(randomNum==1){
			p.addMoney(200);
		}else if(randomNum==2){
			p.removeMoney(50);
		}else if(randomNum==3){
			p.setPosition(0);
		}else{
			p.setPosition(10);
		}
		
		setLastCard(randomNum);
	}

	@Override
	public boolean getMortgage() {
		return false;
	}

	@Override
	public void Buy(Player p) {

	}

	public int getLastCard() {
		return lastCard;
	}

	public void setLastCard(int lastCard) {
		this.lastCard = lastCard;
	}

}
