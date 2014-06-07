package logic;

import java.util.Vector;

public class Player {
	private String name;
	private String token;
	private int position;
	private int previous_position;
	private int money;
	private int arested_time;
	private Vector<Space> ownproperties;
	private int worth;
	// false is the player has already lost
	private boolean alive;
	private boolean ddice;
	
	public Player(){
		this.name="default";
		this.token="carro";
		this.position=0;
		this.previous_position=position;
		this.money=1500;
		this.worth=1500;
		this.alive=true;
		this.arested_time=0;
	}
	
	public Player(String name, String token){
		this.name = name;
		this.token = token;
		this.position=0;
		this.previous_position=position;
		this.money=1500;
		this.worth=1500;
		this.alive=true;
		this.arested_time=0;
	}
	
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
		if(this.getMoney() > money){
			this.money = this.money - money;
		}
	}
	//properties related methods
	public Vector<Space> getOwnproperties() {
		return ownproperties;
	}
	public void setOwnproperties(Vector<Space> ownproperties) {
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
	public void PassThroughStart(){
		if(this.getPosition() < this.getPrevious_position()){
			this.addMoney(200);
		}
	}
		
	
	/*
	public boolean Mortage(){
		return false;
	}
	public boolean Unmortgage(){
		return false;
	}
	*/
	public boolean getAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public int getPrevious_position() {
		return previous_position;
	}
	public void setPrevious_position(int previous_position) {
		this.previous_position = previous_position;
	}
	
	public void addBuild(){
		//TODO
	}
	
	public int getArested_time() {
		return arested_time;
	}
	public void setArested_time(int arested_time) {
		this.arested_time = arested_time;
	}

	public boolean RollDice(){
		int move1 = (int)(Math.random() * 6+1);
		int move2 = (int)(Math.random() * 6+1);
		if(move1==move2){
			ddice = true;
		}else{
			ddice = false;
		}
		if(this.getArested_time() == 0 || ddice==true){
			this.setPrevious_position(this.position);
			this.setPosition(this.getPosition()+move1+move2);
		}
		
		this.PassThroughStart();
		
		if(move1==move2)
			return true;
		else
			return false;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getDdice() {
		return ddice;
	}
	public void setDdice(boolean ddice) {
		this.ddice = ddice;
	}
}
