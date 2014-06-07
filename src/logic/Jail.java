package logic;

import java.util.Scanner;


public class Jail extends Space {
	public Jail(){
		
	}
	
	@Override
	public void Action(Player p) {
		//may not let the player leave, once it is set only by the player is on the jail TODO
		//removing this the GoToJail square will be completely functional, but will have troubles when the player steps on Jail
		if(p.getPosition() != p.getPrevious_position()){
			p.setArested_time(3);
		}
		p.setPrevious_position(p.getPosition());		
	}

	@Override
	public boolean getMortgage() {
		return false;
	}

	@Override
	public void Buy(Player p) {
		// TODO Auto-generated method stub
		
	}
	
	public void Pay(Player p){
		p.removeMoney(50);
		p.setArested_time(0);
	}
	
	public void TryDouble(Player p){
		//see Player's RollDice method
		p.RollDice();
		if(p.getDdice()){
			p.setArested_time(0);
		}
		else if(p.getArested_time() > 0){
			p.setArested_time(p.getArested_time()-1);
		}
	}

}
