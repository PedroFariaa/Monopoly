package tests;

import static org.junit.Assert.*;

import logic.Player;

import org.junit.Test;

public class tests {

	//Checks if the user moves place when the dices are rolled
	@Test
	public void test_RollDice(){
		Player p = new Player();
		assertEquals(true, p.getPosition() == 0);
		p.RollDice();
		assertFalse(p.getPosition() == 0);
	}
	
	//Checks if the player is at the same position than the property in the board, has enough money and if the property hasn't been already bought
	@Test
	public void test_BuyProperty(){
		
	}
	
	//Checks if the player pays rent only when the property belongs to another player and if the property is not mortage
	@Test
	public void test_paysRent(){
		
		
	}
	
	//Checks if the trade transition(buy/sell) between 2 players is properly made (checks the number of properties and amount of money)
	@Test
	public void test_TradeProperty(){
		
	}
	
	//Checks if the player receives the money when passing through the start or stand the start
	@Test
	public void test_PassStart(){
		
	}
	
	//Checks if the arrested player doesn't move until e pays to leave or he waits 3 turns or until he has a double rolling the dices 
	@Test
	public void test_StayInPrison(){
		
	}
	
	//Checks if the player's position is changed to the jail's position in the board, when he stands at the "Go To Jail"
	@Test
	public void test_GoToJail(){
		
	}
	
	//Checks if the property's rent increases based on the number of apartments or hotels
	@Test
	public void test_IncreasingRent(){
		
	}
	
	//Check if it was added/removed an apartment or hotel to a property
	@Test
	public void test_Apartements(){
		//checks if is a property
	}
	
	//Checks special spaces(community chest, luck, taxes, freeParking)
	@Test
	public void test_OtherCards(){
		
	}
	
	
}
