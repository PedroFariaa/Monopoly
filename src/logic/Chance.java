package logic;

public class Chance extends Space {
	int lastCard = 0;
	@Override
	public void Action(Player p) {
		// TODO Auto-generated method stub
		int randomNum = (int)(Math.random()*7); 
		if(randomNum==0){
			p.addMoney(50);
		}else if(randomNum==1){
			p.removeMoney(150);
		}else if(randomNum==2){
			p.setPosition(39);
		}else if(randomNum==3){
			p.setPosition(0);
		}else if(randomNum==4){
			p.setPosition(10);
		}else if(randomNum==5){
			p.setPosition(p.getPosition()-3);
		}else{
			int amount=0;
			for(int i=0; i<p.getOwnproperties().size(); i++){
				//TODO
			}
			p.removeMoney(amount);
		}
		lastCard=randomNum;
	}

	@Override
	public boolean getMortgage() {
		return false;
	}

	@Override
	public void Buy(Player p) {

	}
	
	public int getLastCard(){
		return this.lastCard;
	}
}
