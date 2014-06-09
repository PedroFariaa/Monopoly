package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import logic.Player;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;


public class GameConfigPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private String mode;
	private Vector<Player> players;
	private BufferedImage background;
	private JTextField P1Nick;
	private JTextField P2Nick;
	private JTextField P3Nick;
	private JTextField P4Nick;
	private JLabel lblP1Nick;
	private JComboBox<String> tokenP1;
	private JLabel lblP2Nick;
	private JComboBox<String> tokenP2;
	private JLabel lblP3Nick;
	private JComboBox<String> tokenP3;
	private JLabel lblP4Nick;
	private JComboBox<String> tokenP4;
	private JButton btnBack;
	private JButton btnPlay;

	public GameConfigPanel(String mode, int np) {

		setSize(1150,650);
		setEnabled(true);
		requestFocus(true);
		
		this.mode = mode;
		this.players = new Vector<Player>();
		
		players.setSize(np);
	
		lblP1Nick = new JLabel("Player 1 nick");
		lblP1Nick.setBounds(262, 226, 98, 14);
		lblP1Nick.setForeground(new Color(255, 255, 255));
		
		P1Nick = new JTextField();
		P1Nick.setBounds(336, 226, 86, 20);
		P1Nick.setBackground(new Color(255, 51, 51));
		P1Nick.setForeground(new Color(255, 255, 255));
		lblP1Nick.setLabelFor(P1Nick);
		P1Nick.setColumns(10);
		
		tokenP1 = new JComboBox<String>();
		tokenP1.setBounds(428, 226, 61, 20);
		tokenP1.setModel(new DefaultComboBoxModel<String>(new String[] {"dog", "thimble", "car", "hat"}));
		tokenP1.setBackground(new Color(255, 51, 51));
		tokenP1.setForeground(new Color(255, 255, 255));
		tokenP1.setMaximumRowCount(4);
		
		lblP2Nick = new JLabel("Player 2 nick");
		lblP2Nick.setBounds(262, 276, 98, 14);
		lblP2Nick.setForeground(Color.WHITE);
		
		P2Nick = new JTextField();
		P2Nick.setBounds(336, 276, 86, 20);
		P2Nick.setBackground(new Color(255, 51, 51));
		lblP2Nick.setLabelFor(P2Nick);
		P2Nick.setForeground(new Color(255, 255, 255));
		P2Nick.setColumns(10);
		
		tokenP2 = new JComboBox<String>();
		tokenP2.setBounds(428, 276, 61, 20);
		tokenP2.setModel(new DefaultComboBoxModel<String>(new String[] {"thimble", "car", "hat", "dog"}));
		tokenP2.setMaximumRowCount(4);
		tokenP2.setForeground(Color.WHITE);
		tokenP2.setBackground(new Color(255, 51, 51));
		
		lblP3Nick = new JLabel("Player 3 nick");
		lblP3Nick.setBounds(262, 337, 98, 14);
		lblP3Nick.setHorizontalAlignment(SwingConstants.LEFT);
		lblP3Nick.setForeground(Color.WHITE);
		
		P3Nick = new JTextField();
		lblP3Nick.setLabelFor(P3Nick);
		P3Nick.setBounds(336, 331, 86, 20);
		P3Nick.setForeground(Color.WHITE);
		P3Nick.setColumns(10);
		P3Nick.setBackground(new Color(255, 51, 51));
		
		tokenP3 = new JComboBox<String>();
		tokenP3.setBounds(428, 331, 61, 20);
		tokenP3.setModel(new DefaultComboBoxModel<String>(new String[] {"car", "hat", "dog", "thimble"}));
		tokenP3.setMaximumRowCount(4);
		tokenP3.setForeground(Color.WHITE);
		tokenP3.setBackground(new Color(255, 51, 51));
		
		lblP4Nick = new JLabel("Player 4 nick");
		lblP4Nick.setBounds(262, 395, 98, 14);
		lblP4Nick.setForeground(Color.WHITE);
		
		P4Nick = new JTextField();
		lblP4Nick.setLabelFor(P4Nick);
		P4Nick.setBounds(336, 389, 86, 20);
		P4Nick.setForeground(Color.WHITE);
		P4Nick.setColumns(10);
		P4Nick.setBackground(new Color(255, 51, 51));
		
		tokenP4 = new JComboBox<String>();
		tokenP4.setBounds(428, 389, 61, 20);
		tokenP4.setModel(new DefaultComboBoxModel<String>(new String[] {"hat", "dog", "thimble", "car"}));
		tokenP4.setMaximumRowCount(4);
		tokenP4.setForeground(Color.WHITE);
		tokenP4.setBackground(new Color(255, 51, 51));
		
		btnBack = new JButton("Menu");
		btnBack.setBounds(1007, 566, 101, 56);
		btnBack.setBackground(new Color(255, 51, 51));
		add(btnBack);

		btnPlay = new JButton("PLAY !\r\n");
		btnPlay.setBounds(341, 478, 108, 66);
		btnPlay.setBackground(new Color(255, 51, 51));
		add(btnPlay);
		
		
		setButtons();
		setLayout(null);
		add(lblP1Nick);
		add(P1Nick);
		add(tokenP1);
		add(lblP2Nick);
		add(P2Nick);
		add(tokenP2);
		
		if(np > 2){
			add(lblP3Nick);
			add(P3Nick);
			add(tokenP3);

			if(np>3){
				add(lblP4Nick);
				add(P4Nick);
				add(tokenP4);
			}
		}
		
		
		try {
			background = ImageIO.read(new File("src/images/Monopoly.png")) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void setButtons() {
		
		//PLAY BUTTON
		btnPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				players.set(0, new Player(P1Nick.getText(), (String) tokenP1.getSelectedItem()));
				players.set(1, new Player(P2Nick.getText(), (String) tokenP2.getSelectedItem()));
				
				if(players.size() > 2){
					players.set(2, new Player(P3Nick.getText(), (String) tokenP3.getSelectedItem()));

					if(players.size() > 3){
						players.set(3, new Player(P4Nick.getText(), (String) tokenP4.getSelectedItem()));
					}
				}
				getRootPane().setContentPane(new InitialPanel());
				
				BoardWindow window = new BoardWindow(players, mode);
				window.setVisible(true);	
								
			}
		});
		
		//BACK BUTTON
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getRootPane().setContentPane(new NewGamePanel());
				
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
