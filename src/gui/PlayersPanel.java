package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import logic.Player;

public class PlayersPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage background;

	
	/**
	 * Create the panel.
	 */
	public PlayersPanel(Player[] players, String mode){
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);

		setSize(575, 272);

		try {
			background= ImageIO.read(new File("src/Images/fundo.jpg")) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//all the players' information
		//name, token, money, properties
	}

	/**
	 * Print images
	 */
	protected void paintComponent(Graphics g){
		requestFocus(true);
		setFocusable(true);
		int height=this.getHeight();
		int width=this.getWidth();

		g.drawImage(background, 0, 0, width, height, Color.WHITE, null);
	}

}
