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
import javax.swing.JLabel;

public class PlayersPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	/**
	 * Create the panel.
	 */
	public PlayersPanel(Player[] players, String mode){
		setBackground(new Color(0, 153, 51));
		setForeground(Color.WHITE);

		setSize(265, 671);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 11, 213, 137);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblToken = new JLabel("Token");
		lblToken.setBounds(157, 11, 46, 14);
		panel.add(lblToken);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(23, 170, 213, 137);
		add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(23, 340, 213, 137);
		add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(23, 510, 213, 137);
		add(panel_3);

		

		//all the players' information
		//name, token, money, properties
		
		if(players.length==1){
			
		}
	}
}
