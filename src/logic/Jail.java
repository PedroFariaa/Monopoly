package logic;

import java.util.Scanner;


public class Jail extends Space {
	private Scanner s;

	public Jail(){
		
	}
	
	@Override
	public void Action(Player p) {
		//may not let the player leave, once it is set only by the player is on the jail
		//removing this the GoToJail square will be completely functional, but will have troubles when the player steps on Jail
		p.setArested_time(3);
		s = new Scanner(System.in);
		String n = "";
		while(n != "p" || n!="pay" || n!="double" | n!="d"){
			System.out.println("Do you want to pay 50$ (pay) or try to get a double (double)?");
			n = s.next();
			n.toLowerCase();
			if(n=="p" || n=="pay"){
				p.removeMoney(50);
				p.setArested_time(0);
			}else{
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
		
	}

	@Override
	public boolean getMortgage() {
		return false;
	}

}
