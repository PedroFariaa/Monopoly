package logic;


public class Companies extends Space {
	private int price;
	private boolean owned;
	private Player owner;
	//the rent paid is equal to dice number*4 (if the player owns a company) or dice number*10 (if the player owns both companies)
	private int rent = 0;

	@Override
	public void Action(Player p) {
		int n_companies=0;
		if(this.getOwned()){
			if(this.getOwner()==p){
				//do nothing
			}else{
				rent = p.getPosition() - p.getPrevious_position();
				for(int i=0; i<p.getOwnproperties().size(); i++){
					if(p.getOwnproperties().get(i).getClass() == this.getClass()){
						n_companies++;
					}
				}
				if(n_companies==1){
					p.removeMoney(4*rent);
					this.getOwner().addMoney(4*rent);
				}else if(n_companies==2){
					p.removeMoney(10*rent);
					this.getOwner().addMoney(10*rent);
				}
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
