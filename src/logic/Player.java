package logic;

import java.util.ArrayList;

public class Player {
	private String token;
	private int position;
	private int money;
	private ArrayList<Space> ownproperties;
	private int worth;
	private boolean active;
	
	//token related methods
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	//position related methods
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	//money related methods
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void addMoney(int money){
		this.money = this.money + money;
	}
	public void removeMoney(int money){
		this.money = this.money - money;
	}
	
	//properties related methods
	public ArrayList<Space> getOwnproperties() {
		return ownproperties;
	}
	public void setOwnproperties(ArrayList<Space> ownproperties) {
		this.ownproperties = ownproperties;
	}
	public void addOwnproperties(Space property){
		this.ownproperties.add(property);
	}
	public boolean removeOwnproperties(Space property){
		if(this.ownproperties.contains(property)){
			this.ownproperties.remove(property);
			return true;
		}else
			return false;
	}
	
	//worth related methods
	public int getWorth() {
		return worth;
	}
	public void setWorth(int worth) {
		this.worth = worth;
	}
	
	//active related methods
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
