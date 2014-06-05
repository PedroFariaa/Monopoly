package gui;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

import logic.Player;

public class PanelNewGame extends JPanel {

	private BufferedImage background;
	private JButton btnNewButton, btnNewButton_1;
	private JComboBox comboBox, comboBox_1, comboBox_2;
	private MenuPanel NewMainMeu;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtName;
	private JPanel contentPanel;

	public PanelNewGame(){

		setSize(1150,650);

		setBackground(new Color(240, 240, 240));
		try {
			background = ImageIO.read(new File("src/images/Monopoly.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setLayout(null);


		// Elements
		txtName = new JTextField();
		txtName.setBounds(350, 217, 86, 20);
		txtName.setText("Name");
		add(txtName);
		txtName.setColumns(10);

		btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(1007, 566, 101, 56);
		btnNewButton.setBackground(new Color(255, 51, 51));
		add(btnNewButton);

		comboBox = new JComboBox();
		comboBox.setBounds(350, 267, 63, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dog", "Ship", "Hat", "Car"}));
		add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(340, 367, 94, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Against PC", "Pass'n'Play", "Network Mode"}));
		add(comboBox_1);

		btnNewButton_1 = new JButton("PLAY !\r\n");
		btnNewButton_1.setBounds(341, 478, 108, 66);
		btnNewButton_1.setBackground(new Color(255, 51, 51));
		add(btnNewButton_1);

		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(399, 406, 37, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		add(comboBox_2);

		JLabel lblToken = new JLabel("Token :");
		lblToken.setBounds(350, 251, 63, 20);
		lblToken.setForeground(Color.WHITE);
		add(lblToken);

		JLabel lblGameMode = new JLabel("Game Mode :");
		lblGameMode.setBounds(340, 346, 86, 20);
		lblGameMode.setForeground(Color.WHITE);
		add(lblGameMode);

		JLabel lblNrPlayers = new JLabel("Nr Players");
		lblNrPlayers.setBounds(340, 408, 71, 17);
		lblNrPlayers.setForeground(Color.WHITE);
		add(lblNrPlayers);

		JSeparator separator = new JSeparator();
		separator.setBounds(301, 320, 193, 8);
		add(separator);

		ButtonsConfiguration();

	}

	/**
	 * Print images */
	protected void paintComponent(Graphics g){
		requestFocus(true);
		setFocusable(true);
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), Color.WHITE, null);
	}

	public void ButtonsConfiguration(){

		//Menu button
		//Returns to the main menu
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getRootPane().setContentPane(new MenuPanel());
			}
		});

		//Play button
		//Begins a new game
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String mode = comboBox_1.getActionCommand();
				int np = comboBox_2.getComponentCount();
				Player[] players = new Player[np];

				//associates players to their information
				players[0] = new Player(txtName.getText(), comboBox.getActionCommand());

				if(np==2){
					players[1] = new Player("Player 2", "iron");
				}else if(np == 3){
					players[2] = new Player("Player 3", "shoe");
				}else if(players.length == 4){
					players[2] = new Player("Player 4", "thimble");
				}

				GameFrame panel = new GameFrame(players, mode);

				getRootPane().setContentPane(panel);
			}
		});

	}
}
