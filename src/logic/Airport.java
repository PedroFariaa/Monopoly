package logic;


public class Airport extends Space {
	private int price;
	private boolean owned;
	private Player owner;
	//the rent paid is equal to number of airports that the owner has * rent
	private int rent;
	private boolean mortgage = false;
	
	public Airport(int price){
		this.price=price;
		this.owned=false;
		this.owner=null;
		this.rent=25;
		this.mortgage=false;
	}
	
	@Override
	public void Action(Player p) {
		int n_airports=0;
		if(this.getOwned()){
			if(this.getOwner()==p){
				//do nothing
			}else{
				for(int i=0; i<p.getOwnproperties().size(); i++){
					if(p.getOwnproperties().get(i).getClass() == this.getClass()){
						//if the owned airport is mortgaged 
						if(!p.getOwnproperties().get(i).getMortgage()){
							n_airports++;
						}
					}
				}
				p.removeMoney(n_airports*rent);
				this.getOwner().addMoney(n_airports*rent);
			}
		}else{
			this.Buy(p);
		}
	}

	public void Buy(Player p){
		if(!this.getOwned()){
			if(p.getMoney() > this.getPrice()){
				p.removeMoney(this.price);
				p.addOwnproperties(this);
				this.setOwned(true);
				this.setOwner(p);
			}
		}
	}
		
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean getOwned() {
		return owned;
	}

	public void setOwned(boolean owned) {
		this.owned = owned;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	@Override
	public boolean getMortgage() {
		return this.mortgage;
	}

}
