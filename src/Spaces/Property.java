package Spaces;

import logic.Player;
import logic.Space;

public class Property extends Space {
	private String color;
	private int price;
	private boolean owned;
	private int rent;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isOwned() {
		return owned;
	}
	public void setOwned(boolean owned) {
		this.owned = owned;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	
	@Override
	public void Action(Player p) {
		if(this.owned){
			p.removeMoney(this.rent);
		}else{
			//tryToBuy
		}
	}
}
