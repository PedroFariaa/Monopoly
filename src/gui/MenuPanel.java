package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComponent btnNewGame, btnLoadGame;
	protected PanelNewGame NewGamePane;

	/**
	 * Create the panel.
	 */
	public MenuPanel() {

		setSize(1200,700);
		setLayout(null);
		
		//New Game
		btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(348, 540, 137, 46);
		btnNewGame.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnNewGame.setBackground(new Color(102, 204, 102));
		btnNewGame.setForeground(Color.WHITE);
		((AbstractButton) btnNewGame).setContentAreaFilled(false);
		btnNewGame.setOpaque(true);
		add(btnNewGame);

		//Load game
		btnLoadGame = new JButton("Load Game");
		btnLoadGame.setBounds(712, 540, 137, 46);
		btnLoadGame.setBackground(new Color(102, 204, 102));
		btnLoadGame.setForeground(Color.WHITE);
		btnLoadGame.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		((AbstractButton) btnLoadGame).setContentAreaFilled(false);
		btnLoadGame.setOpaque(true);
		add(btnLoadGame);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(166, 39, 824, 438);
		lblNewLabel_1.setIcon(new ImageIcon(MenuPanel.class.getResource("/images/logo.png")));
		add(lblNewLabel_1);

		ButtonsConfiguration();
	}

	private void ButtonsConfiguration() {
		((AbstractButton) btnNewGame).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
				setEnabled(false);

				NewGamePane = new PanelNewGame();
				getRootPane().setContentPane(NewGamePane);
			}
		});

		//LOAD GAME
		((AbstractButton) btnLoadGame).addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loadGame();
				//janela.inciaJogo(lab);
			}
		});

	}

	protected void loadGame() {
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

				//monopoly=(MonopolyLogic) entrie.readObject();
				entrie.close();
			}catch(IOException ex){
				JOptionPane.showMessageDialog(new JFrame().getRootPane(), "Erro, ficheiro não carregado!");
				ex.printStackTrace();
			}
		}
	}

}
