package logic;


public class Property extends Space {
	private String name;
	private String color;
	private int price;
	private boolean owned;
	private Player owner;
	private int normalRent;
	//the rent is increased by the number of apartments/hotel in the property
	private int OneRent;
	private int TwoRent;
	private int ThreeRent;
	private int FourRent;
	private int HotelRent;
	private int n_apart;
	private int n_hotel;
	private boolean mortgage=false;
	
	
	public Property(String name, String color, int price, int normalRent, int OneRent, int TwoRent, int ThreeRent, int FourRent, int HotelRent){
		this.name=name;
		this.color = color;
		this.price=price;
		this.normalRent=normalRent;
		this.OneRent=OneRent;
		this.TwoRent=TwoRent;
		this.ThreeRent=ThreeRent;
		this.FourRent=FourRent;
		this.HotelRent=HotelRent;
		this.mortgage=false;
	}
	
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
	
	
	@Override
	public void Action(Player p) {
		if(this.owned){
			if(this.owner != p){
				p.removeMoney(this.getRent());
				this.owner.addMoney(this.getRent());
			}
		}else{
			this.Buy(p);
		}
	}
	
	public void Buy(Player p){
		if(p.getMoney() > this.getPrice()){
			p.removeMoney(this.price);
			p.addOwnproperties(this);
			this.setOwned(true);
			this.setOwner(p);
		}
	}
	
	private int getRent() {
		int newrent = 0;
		if(!this.getMortgage()){
			if(this.n_apart==0 && this.n_hotel==0){
				newrent = normalRent;
			}else if(this.n_hotel == 1){
				newrent = HotelRent;
			}else if(this.n_apart==4){
				newrent = FourRent;
			}else if(this.n_apart==3){
				newrent = ThreeRent;
			}else if(this.n_apart==2){
				newrent = TwoRent;
			}else if(this.n_apart==1){
				newrent = OneRent;
			}
		}
		
		return newrent;
	}
	
	public void addBuild(){
		if(n_hotel != 1){
			if(n_apart==4){
				n_apart=0;
				n_hotel=1;
			}else if(n_apart < 4){
				n_apart++;
			}
		}	
	}
	
	public void removeBuild(){
		if(n_apart > 0 || n_hotel == 1){
			if(n_hotel==1){
				n_hotel = 0;
				n_apart=4;
			}else{
				n_apart--;
			}
		}
	}

	public int getN_apart() {
		return n_apart;
	}
	public void setN_apart(int n_apart) {
		this.n_apart = n_apart;
	}
	public int getN_hotel() {
		return n_hotel;
	}
	public void setN_hotel(int n_hotel) {
		this.n_hotel = n_hotel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	@Override
	public boolean getMortgage() {
		return this.mortgage;
	}
}
