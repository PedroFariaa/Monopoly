package logic;


public class Airport extends Space {
	private int price;
	private boolean owned;
	private Player owner;
	//the rent paid is equal to number of airports that the owner has * rent
	private int rent;
	
	@Override
	public void Action(Player p) {
		int n_airports=0;
		if(this.getOwned()){
			if(this.getOwner()==p){
				//do nothing
			}else{
				for(int i=0; i<p.getOwnproperties().size(); i++){
					if(p.getOwnproperties().get(i).getClass() == this.getClass()){
						n_airports++;
					}
				}
				p.removeMoney(n_airports*rent);
				this.getOwner().addMoney(n_airports*rent);
			}
		}else{
			p.Buy();
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

}
