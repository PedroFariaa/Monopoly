package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import logic.Player;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PlayingPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PlayingPanel(Player[] players, String mode) {
		setBackground(new Color(0, 153, 51));
		setForeground(Color.WHITE);

		//monopoly=new MonopolyLogic(players , mode);

		setSize(264,671);
		setVisible(true);
		setFocusable(true);
		setLayout(null);
		
		JButton btnRollDice = new JButton("Roll Dice");
		btnRollDice.setBounds(74, 58, 91, 38);
		add(btnRollDice);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setBounds(74, 131, 91, 38);
		add(btnBuy);
		
		JButton btnMortgageUnmortgage = new JButton("Mortgage / Unmortgage");
		btnMortgageUnmortgage.setBounds(37, 216, 171, 73);
		add(btnMortgageUnmortgage);
		
		JButton btnEndTurn = new JButton("End Turn");
		btnEndTurn.setBounds(63, 332, 116, 53);
		add(btnEndTurn);
		
		JButton btnExitGame = new JButton("Exit Game");
		btnExitGame.setBounds(99, 570, 91, 37);
		add(btnExitGame);
		setupButtons();
	}



	/**
	 * Setup all buttons
	 */
	public void setupButtons(){

	}
}
