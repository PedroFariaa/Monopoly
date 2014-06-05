package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import logic.Player;

public class PlayingPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage background;

	/**
	 * Create the panel.
	 */
	public PlayingPanel(Player[] players, String mode) {
		setForeground(new Color(153, 0, 0));

		try {
			background= ImageIO.read(new File("src/Images/fundo.jpg")) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//monopoly=new MonopolyLogic(players , mode);

		setSize(575,671);
		setVisible(true);
		setFocusable(true);

		setupButtons();
	}



	/**
	 * Setup all buttons
	 */
	public void setupButtons(){

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
