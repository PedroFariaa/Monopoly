package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

public class Monopoly extends JFrame{

	private JPanel contentPane;
	JButton btnNewGame, btnLoadGame, btnInstructions;
	PanelNewGame NewGamePane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monopoly frame = new Monopoly();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Monopoly() {
		setMaximumSize(new Dimension(1200, 700));
		
		this.setResizable(false);
		this.setTitle("Monopoly Java");
		
		//Main window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setFont(new Font("Arial Black", Font.PLAIN, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Setting up the buttons
		mainMenuBtn();
		
		//Background
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Monopoly.class.getResource("/images/logo.png")));
		lblNewLabel.setBounds(10, 0, 824, 512);
		contentPane.add(lblNewLabel);
	}
	
	public void mainMenuBtn() {
		
		//New Game
		btnNewGame = new JButton("New Game");
		btnNewGame.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnNewGame.setBackground(new Color(102, 204, 102));
		btnNewGame.setForeground(Color.WHITE);
		btnNewGame.setContentAreaFilled(false);
		btnNewGame.setOpaque(true);
		btnNewGame.setBounds(362, 558, 131, 40);
		contentPane.add(btnNewGame);
		
		//Load game
		btnLoadGame = new JButton("Load Game");
		btnLoadGame.setBackground(new Color(102, 204, 102));
		btnLoadGame.setForeground(Color.WHITE);
		btnLoadGame.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnLoadGame.setContentAreaFilled(false);
		btnLoadGame.setOpaque(true);
		btnLoadGame.setBounds(39, 564, 118, 29);
		contentPane.add(btnLoadGame);
		
		//Instructions
		btnInstructions = new JButton("Instructions");
		btnInstructions.setBackground(new Color(102, 204, 102));
		btnInstructions.setForeground(Color.WHITE);
		btnInstructions.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnInstructions.setContentAreaFilled(false);
		btnInstructions.setOpaque(true);
		btnInstructions.setBounds(676, 564, 118, 29);
		contentPane.add(btnInstructions);
		
		
		ButtonsConfiguration();
	}
	
	public void ButtonsConfiguration() {
		
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.setVisible(false);
				contentPane.setEnabled(false);
				
				NewGamePane = new PanelNewGame();
				NewGamePane.setBackground(new Color(255, 255, 255));
				NewGamePane.setFont(new Font("Arial Black", Font.PLAIN, 11));
				NewGamePane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(NewGamePane);
				NewGamePane.setLayout(null);
				NewGamePane.setVisible(true);
				NewGamePane.setEnabled(true);
			}
		});
	}

	//TODO
	public void loadGameBtn() {}
	
	//TODO
	public void instructionsBtn() {}

	
	

}
