/**
 * 
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.filechooser.FileNameExtensionFilter;

import logic.Game;

public class InitialPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage background;
	private JButton btnNewGame;
	private JButton btnLoadGame;
	private JButton btnExit;
	private Game g;
	private NewGamePanel newGamePanel;
	
	InitialPanel(){
		setSize(1200,700);
		
		
		setSize(1200,700);
		setLayout(null);
		
		//New Game
		btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(348, 540, 137, 46);
		btnNewGame.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnNewGame.setBackground(new Color(102, 204, 102));
		btnNewGame.setForeground(Color.WHITE);
		btnNewGame.setContentAreaFilled(false);
		btnNewGame.setOpaque(true);
		add(btnNewGame);

		//Load game
		btnLoadGame = new JButton("Load Game");
		btnLoadGame.setBounds(712, 540, 137, 46);
		btnLoadGame.setBackground(new Color(102, 204, 102));
		btnLoadGame.setForeground(Color.WHITE);
		btnLoadGame.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnLoadGame.setContentAreaFilled(false);
		btnLoadGame.setOpaque(true);
		add(btnLoadGame);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(166, 39, 824, 438);
		lblNewLabel_1.setIcon(new ImageIcon("src/Images/logo.png"));
		add(lblNewLabel_1);
		
		try {
			setupButtons();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setLayout(null);
		add(btnLoadGame);
		add(btnNewGame);
		
	}
	
	/**
	 * setup the 3 buttons
	 */
	public void setupButtons() throws ClassNotFoundException {
		//NEW GAME
		btnNewGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				setEnabled(false);
				
				newGamePanel = new NewGamePanel();
				
				getRootPane().setContentPane(newGamePanel);
				
			}

		});
		
		
		//LOAD GAME
		btnLoadGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loadGame(); 
				//janela.inciaJogo(lab);
			}
		});
	}
	
public void loadGame() {
	JFileChooser j = new JFileChooser();
	j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	j.setAcceptAllFileFilterUsed(false);
	j.setFileFilter(new FileNameExtensionFilter("dat", "dat"));

	int i=j.showOpenDialog(new JFrame("Load"));

	if(i==JFileChooser.APPROVE_OPTION){
		try{
			File file= j.getSelectedFile();
			FileInputStream loadFile = new FileInputStream(file);
			ObjectInputStream entrie = new ObjectInputStream(loadFile);

			g=(Game) entrie.readObject();
			entrie.close();
		}catch(IOException ex){
			JOptionPane.showMessageDialog(new JFrame().getRootPane(), "Erro, ficheiro não carregado!");
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
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
