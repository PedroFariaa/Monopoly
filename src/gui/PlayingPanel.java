package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import logic.Game;
import logic.Player;

import javax.swing.JButton;

public class PlayingPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnRollDice, btnBuy, btnMortgageUnmortgage, btnEndTurn, btnExitGame, btnAddBuildings;
	int i = 0;
	Game g;

	/**
	 * Create the panel.
	 */
	public PlayingPanel(Game g) {
		
		this.g=g;
		
		setBackground(new Color(0, 153, 51));
		setForeground(Color.WHITE);

		setSize(264,671);
		setVisible(true);
		setFocusable(true);
		setLayout(null);

		btnRollDice = new JButton("Roll Dice");
		btnRollDice.setBounds(48, 63, 88, 34);
		add(btnRollDice);

		btnBuy = new JButton("Buy");
		btnBuy.setBounds(48, 127, 88, 34);
		add(btnBuy);

		btnMortgageUnmortgage = new JButton("Mortgage / Unmortgage");
		btnMortgageUnmortgage.setBounds(48, 186, 177, 34);
		add(btnMortgageUnmortgage);

		btnEndTurn = new JButton("End Turn");
		btnEndTurn.setBounds(48, 326, 88, 42);
		add(btnEndTurn);

		btnExitGame = new JButton("Exit Game");
		btnExitGame.setBounds(138, 613, 99, 34);
		add(btnExitGame);

		btnAddBuildings = new JButton("Add / Remove\r\n Buildings");
		btnAddBuildings.setBounds(48, 245, 177, 34);
		add(btnAddBuildings);
		setupButtons();
	}



	/**
	 * Setup all buttons
	 */
	public void setupButtons(){
		//RollDice button
		//The players movement shall be implemented in this method
		btnRollDice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Player p = g.getPlayers().get(i);
				p.RollDice();
				g.getBoard().get(p.getPosition()).Action(p);
				//TODO
			}
		});

		//Buy Button
		//buys the property if the player has enough money to do it
		//Only works at properties, airports and services
		btnBuy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Player p = g.getPlayers().get(i);
				g.getBoard().get(p.getPosition()).Buy(p);
			}
		});

		//Mortgage / Unmortgage properties
		btnMortgageUnmortgage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});

		//Add / Remove Buildings
		btnAddBuildings.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});

		//End Turn button
		//increments the i, so the next player plays. checks if the the number of players isn't greater than i+1
		btnEndTurn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(i<g.getPlayers().size() -1){
					i++;
				}else{
					i=0;
				}
			}
		});

		//Returns to the mainMenu but first asks the player if wants to save the game
		btnExitGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Does not close the previous frame
				//TODO ask if wants to save
				getRootPane().setContentPane(new MenuPanel());
			}
		});
	}
}
