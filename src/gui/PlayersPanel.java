package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import logic.Game;
import logic.Player;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PlayersPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Game g;
	JButton btnProperties, button, button_1, button_2;

	
	/**
	 * Create the panel.
	 */
	public PlayersPanel(Game g){
		
		this.g=g;
		
		setBackground(new Color(0, 153, 51));
		setForeground(Color.WHITE);

		setSize(265, 671);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 11, 213, 137);
		add(panel);
		
		JLabel lblToken = new JLabel("Token");
		lblToken.setBounds(146, 11, 57, 54);
		lblToken.setIcon(new ImageIcon(PlayersPanel.class.getResource("/images/icon.jpg")));
		
		btnProperties = new JButton("Properties");
		btnProperties.setBounds(114, 103, 89, 23);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setBounds(10, 11, 37, 20);
		txtpnName.setText("Name:");
		
		JTextPane txtpnPedro = new JTextPane();
		txtpnPedro.setBounds(20, 32, 73, 20);
		txtpnPedro.setText("Pedro");
		
		JTextPane txtpnCash = new JTextPane();
		txtpnCash.setBounds(10, 63, 37, 20);
		txtpnCash.setText("Cash :");
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(20, 84, 73, 20);
		textPane_1.setText("1500\r\n");
		panel.setLayout(null);
		panel.add(lblToken);
		panel.add(btnProperties);
		panel.add(txtpnName);
		panel.add(txtpnPedro);
		panel.add(txtpnCash);
		panel.add(textPane_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(23, 170, 213, 137);
		add(panel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 213, 137);
		panel_1.add(panel_4);
		
		JLabel label = new JLabel("Token");
		label.setBounds(146, 11, 57, 54);
		panel_4.add(label);
		
		button = new JButton("Properties");
		button.setBounds(114, 103, 89, 23);
		panel_4.add(button);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Name:");
		textPane.setBounds(10, 11, 37, 20);
		panel_4.add(textPane);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("asd");
		textPane_2.setBounds(20, 32, 73, 20);
		panel_4.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Cash :");
		textPane_3.setBounds(10, 63, 37, 20);
		panel_4.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("1500\r\n");
		textPane_4.setBounds(20, 84, 73, 20);
		panel_4.add(textPane_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(23, 340, 213, 137);
		add(panel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 213, 137);
		panel_2.add(panel_5);
		
		JLabel label_1 = new JLabel("Token");
		label_1.setBounds(146, 11, 57, 54);
		panel_5.add(label_1);
		
		button_1 = new JButton("Properties");
		button_1.setBounds(114, 103, 89, 23);
		panel_5.add(button_1);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("Name:");
		textPane_5.setBounds(10, 11, 37, 20);
		panel_5.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("fgh");
		textPane_6.setBounds(20, 32, 73, 20);
		panel_5.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("Cash :");
		textPane_7.setBounds(10, 63, 37, 20);
		panel_5.add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("1500\r\n");
		textPane_8.setBounds(20, 84, 73, 20);
		panel_5.add(textPane_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(23, 510, 213, 137);
		add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 213, 137);
		panel_3.add(panel_6);
		
		JLabel label_2 = new JLabel("Token");
		label_2.setBounds(146, 11, 57, 54);
		panel_6.add(label_2);
		
		button_2 = new JButton("Properties");
		button_2.setBounds(114, 103, 89, 23);
		panel_6.add(button_2);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("Name:");
		textPane_9.setBounds(10, 11, 37, 20);
		panel_6.add(textPane_9);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setText("klp");
		textPane_10.setBounds(20, 32, 73, 20);
		panel_6.add(textPane_10);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setText("Cash :");
		textPane_11.setBounds(10, 63, 37, 20);
		panel_6.add(textPane_11);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setText("1500\r\n");
		textPane_12.setBounds(20, 84, 73, 20);
		panel_6.add(textPane_12);

		

		//defines which is the visible information
		if(g.getPlayers().size()==1){
			panel.setVisible(true);
			panel_1.setVisible(false);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
		}else if(g.getPlayers().size()==2){
			panel.setVisible(true);
			panel_1.setVisible(true);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
		}else if(g.getPlayers().size()==3){
			panel.setVisible(true);
			panel_1.setVisible(true);
			panel_2.setVisible(true);
			panel_3.setVisible(false);
		}else{
			panel.setVisible(true);
			panel_1.setVisible(true);
			panel_2.setVisible(true);
			panel_3.setVisible(true);
		}
	}
	
	
	/**
	 * Setup all buttons
	 */
	public void setupButtons(){
		//Buttons responsible to show the properties of each player
		btnProperties.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Player p = g.getPlayers().get(0);
				p.RollDice();
				g.getBoard().get(p.getPosition()).Action(p);
				//TODO
			}
		});
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Player p = g.getPlayers().get(0);
				p.RollDice();
				g.getBoard().get(p.getPosition()).Action(p);
				//TODO
			}
		});
		
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Player p = g.getPlayers().get(0);
				p.RollDice();
				g.getBoard().get(p.getPosition()).Action(p);
				//TODO
			}
		});
		
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Player p = g.getPlayers().get(0);
				p.RollDice();
				g.getBoard().get(p.getPosition()).Action(p);
				//TODO
			}
		});
		
	}
	
	
	public void repaint(){
		//TODO change money and properties
	}
}
