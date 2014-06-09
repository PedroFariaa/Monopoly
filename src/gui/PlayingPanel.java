package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logic.Airport;
import logic.Chance;
import logic.Community;
import logic.Companies;
import logic.Game;
import logic.Player;
import logic.Property;
import javax.swing.filechooser.FileNameExtensionFilter;


public class PlayingPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private PlayersPanel playersPanel;
	private JButton btnRollDice;
	private JButton btnMortgage;
	private JButton btnBuy;
	private JButton btnView;
	private JButton btnBuildings;
	private JButton btnExit;
	private JButton btnSave;
	private JButton btnDone;
	private Game g;
	private ActionPanel actionPanel;


	public PlayingPanel(Vector<Player> players, String mode){
		setBackground(new Color(102,204,102));
		setForeground(new Color(255, 255, 255));

		g=new Game(players , mode);

		setSize(575,671);
		setVisible(true);
		setFocusable(true);

		btnRollDice = new JButton("Roll Dice");
		btnRollDice.setBounds(29, 596, 93, 23);
		btnRollDice.setForeground(new Color(255, 255, 255));
		btnRollDice.setBackground(new Color(255, 51, 51));

		btnView = new JButton("View");
		btnView.setBounds(428, 596, 114, 23);
		btnView.setForeground(new Color(255, 255, 255));
		btnView.setBackground(new Color(255, 51, 51));

		btnMortgage = new JButton("Mortgage");
		btnMortgage.setBounds(149, 596, 114, 23);
		btnMortgage.setForeground(new Color(255, 255, 255));
		btnMortgage.setBackground(new Color(255, 51, 51));

		btnBuy = new JButton("Buy");
		btnBuy.setBounds(299, 596, 93, 23);
		btnBuy.setForeground(new Color(255, 255, 255));
		btnBuy.setBackground(new Color(255, 51, 51));
		btnBuy.setEnabled(false);

		btnSave = new JButton("Save");
		btnSave.setBounds(299, 637, 93, 23);
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(255, 51, 51));

		btnExit = new JButton("Exit");
		btnExit.setBounds(428, 637, 114, 23);
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(255, 51, 51));

		btnBuildings = new JButton("Buildings");
		btnBuildings.setBounds(29, 637, 93, 23);
		btnBuildings.setForeground(new Color(255, 255, 255));
		btnBuildings.setBackground(new Color(255, 51, 51));

		btnDone = new JButton("Done");
		btnDone.setBounds(149, 637, 114, 23);
		btnDone.setBackground(new Color(255, 51, 51));
		btnDone.setForeground(new Color(255, 255, 255));

		setupButtons();	

		playersPanel = new PlayersPanel(g.getPlayers());
		playersPanel.setBounds(0, 0, 575, 208);

		actionPanel = new ActionPanel();
		actionPanel.setBounds(0, 214, 575, 371);
		actionPanel.setBackground(new Color(255, 51, 51));

		setLayout(null);
		add(playersPanel);
		add(btnRollDice);
		add(btnBuildings);
		add(btnMortgage);
		add(btnDone);
		add(btnSave);
		add(btnBuy);
		add(btnView);
		add(btnExit);
		add(actionPanel);
	}

	/**
	 * Setup all buttons
	 */
	public void setupButtons(){

		//BUILDINGS BUTTON
		btnBuildings.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actionPanel.setPlayerPlaying(g.getPlayers().get(g.i));
				actionPanel.setMode("buildings");
				actionPanel.setIndex();

				actionPanel.repaint();
				playersPanel.repaint();
				getParent().repaint();

				actionPanel.previous.setVisible(false);
				actionPanel.next.setVisible(false);
				actionPanel.select.setVisible(false);
			}
		});

		//VIEW BUTTON
		btnView.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//after move the token according to the dice result,
				//show on actionPanel the card relative to new player's position on the board
				actionPanel.setMode("showCard");
				int location = (g.getPlayers().get(g.i)).getPosition();
				String typeOfCart = g.getBoard().get(location).getClassName();

				if(typeOfCart == "Chance")
					location= ((Chance) g.getBoard().get(g.getPlayers().get(g.i).getPosition())).getLastCard();
				else if(typeOfCart == "Community")
					location= ((Community) g.getBoard().get(g.getPlayers().get(g.i).getPosition())).getLastCard();

				actionPanel.setCardToShow(location , typeOfCart);
				actionPanel.repaint();
				playersPanel.repaint();
				getParent().repaint();

				actionPanel.previous.setVisible(false);
				actionPanel.next.setVisible(false);
				actionPanel.select.setVisible(false);

				actionPanel.addBuilding.setVisible(false);
				actionPanel.removeBuilding.setVisible(false);
			}
		});

		//MORTGAGE BUTTON
		btnMortgage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//monopoly.Mortgage();
				actionPanel.setMode("mortgage");
				actionPanel.setPlayerPlaying(g.getPlayers().get(g.i));
				actionPanel.setIndex();

				actionPanel.repaint();
				playersPanel.repaint();
				getParent().repaint();

			}
		});

		//BUY BUTTON
		btnBuy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				g.Buy();

				btnBuy.setEnabled(false);

				actionPanel.repaint();
				playersPanel.repaint();
				getParent().repaint();

				actionPanel.previous.setVisible(false);
				actionPanel.next.setVisible(false);
				actionPanel.select.setVisible(false);

				actionPanel.addBuilding.setVisible(false);
				actionPanel.removeBuilding.setVisible(false);
			}
		});

		//ROLL DICE BUTTON
		btnRollDice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean canPlay=true;

				if(g.getPlayers().get(g.i).getArested_time() != 0){
					canPlay=false;
					actionPanel.setPlayerPlaying(g.getPlayers().get(g.i));
					g.getPlayers().get(g.i).removeMoney(50);
				}
/*
				actionPanel.tryDouble.setVisible(false);
				actionPanel.pay.setVisible(false);
				actionPanel.arrestMessage.setVisible(false);
*/
				if(canPlay){
					int[] dice = g.RollDice();


					//show dice result on actionPanel
					actionPanel.setDice(dice);
					actionPanel.setMode("dice");
					actionPanel.repaint();

					playersPanel.repaint();
					getParent().repaint();

					//if the dice result is a double the player can roll dice again
					if(dice[0] != dice[1])
						btnRollDice.setEnabled(false);

					//disable buy button if a space is not available to buy
					String s = g.getBoard().get(g.getPlayers().get(g.i).getPosition()).getClassName();

					if(s == "Property" && !((Property) g.getBoard().get(g.getPlayers().get(g.i).getPosition())).isOwned())
						btnBuy.setEnabled(true);
					else if(s == "Companies" && !((Companies) g.getBoard().get(g.getPlayers().get(g.i).getPosition())).getOwned())
						btnBuy.setEnabled(true);
					else if(s == "Airport" && !( (Airport) g.getBoard().get(g.getPlayers().get(g.i).getPosition())).getOwned())
						btnBuy.setEnabled(true);

				}else
					btnRollDice.setEnabled(false);
			}
		});

		//DONE BUTTON
		btnDone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				g.EndTurn();
				btnRollDice.setEnabled(true);
				btnBuy.setEnabled(true);
				actionPanel.setMode("");

				actionPanel.repaint();
				getParent().repaint();

				actionPanel.previous.setVisible(false);
				actionPanel.next.setVisible(false);
				actionPanel.select.setVisible(false);

				actionPanel.addBuilding.setVisible(false);
				actionPanel.removeBuilding.setVisible(false);

				actionPanel.tryDouble.setVisible(false);
				actionPanel.pay.setVisible(false);
				actionPanel.arrestMessage.setVisible(false);

			}
		});

		//EXIT BUTTON
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int option=JOptionPane.showConfirmDialog(getRootPane(), "Do you have sure you want to leave?");
				if(option==JOptionPane.YES_OPTION){	
					System.exit(0);
				}
			}
		});

		//SAVE BUTTON
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				saveGame();

				actionPanel.previous.setVisible(false);
				actionPanel.next.setVisible(false);
				actionPanel.select.setVisible(false);

				actionPanel.addBuilding.setVisible(false);
				actionPanel.removeBuilding.setVisible(false);
			}
		});

	}

	/**
	 * Function responsible to save the game
	 */
	private void saveGame() {
		JFileChooser j = new JFileChooser();
		j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		j.setAcceptAllFileFilterUsed(false);
		j.setFileFilter(new FileNameExtensionFilter("dat", "dat"));

		int i=j.showSaveDialog(new JFrame("Guardar"));

		if(i==JFileChooser.APPROVE_OPTION){
			try{
				File file= j.getSelectedFile();
				String nameOfFile= file.getName();

				if(!nameOfFile.endsWith(".dat"))
					file= new File(file + ".dat");

				FileOutputStream saveFile = new FileOutputStream(file);
				ObjectOutputStream output = new ObjectOutputStream(saveFile);

				output.writeObject(g);
				output.close();
			}catch(IOException ex){
				JOptionPane.showMessageDialog(new JFrame().getRootPane(), "An error has occured. Game not saved!");
				ex.printStackTrace();
			}
		}

		requestFocus();
	}
}