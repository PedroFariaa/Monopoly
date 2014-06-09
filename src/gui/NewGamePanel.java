/**
 * 
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class NewGamePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage background;
	private JSpinner numbPlayersSpinner;
	private JButton btnPlay;
	private JButton btnBack;
	
	
	public NewGamePanel(){
		setSize(1150,650);
		setEnabled(true);
		requestFocus(true);
		setLayout(null);

		// Elements
		btnBack = new JButton("Menu");
		btnBack.setBounds(1007, 566, 101, 56);
		btnBack.setBackground(new Color(255, 51, 51));
		add(btnBack);

		btnPlay = new JButton("PLAY !\r\n");
		btnPlay.setBounds(341, 478, 108, 66);
		btnPlay.setBackground(new Color(255, 51, 51));
		add(btnPlay);

		JLabel lblNrPlayers = new JLabel("Nr Players");
		lblNrPlayers.setToolTipText("");
		lblNrPlayers.setBounds(340, 408, 71, 17);
		lblNrPlayers.setForeground(Color.WHITE);
		add(lblNrPlayers);
		
		numbPlayersSpinner = new JSpinner();
		numbPlayersSpinner.setModel(new SpinnerNumberModel(2, 2, 4, 1));
		numbPlayersSpinner.setBounds(399, 406, 29, 20);
		add(numbPlayersSpinner);
		
		setupButtons();
			
		
		try {
			background = ImageIO.read(new File("src/images/Monopoly.png")) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private void setupButtons() {

		//PLAY BUTTON
		btnPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int np = (int)numbPlayersSpinner.getValue();
								
				GameConfigPanel panel = new GameConfigPanel("", np);
				
				getRootPane().setContentPane(panel);
				
			}
		});
		
		
		//BACK BUTTON
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getRootPane().setContentPane(new InitialPanel());
			}
		});
		
	}


	/**
	 * Print images
	 */
	protected void paintComponent(Graphics g){
		requestFocus(true);
		setFocusable(true);
		
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), Color.WHITE, null);
	}
}
