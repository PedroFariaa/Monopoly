package gui;

import java.awt.Toolkit;

import javax.swing.JFrame;
import logic.Player;

public class GameFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BoardPanel board;
	private PlayingPanel playingPanel;
	private PlayersPanel playersPanel;

	/**
	 * Creates the Frame
	 * @param mode
	 * @param players
	 */
	public GameFrame(Player[] players, String mode){
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameFrame.class.getResource("/Images/initial.jpg")));
		
		setResizable(false);
		setTitle("Monopoly Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1200,700);
		/*
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
*/
		
		board = new BoardPanel();
		playingPanel = new PlayingPanel(players, mode);
		playersPanel = new PlayersPanel(players, mode);
	}


	/**
	 * @return the playingPanel
	 */
	public PlayingPanel getPlayingPanel() {
		return playingPanel;
	}

	/**
	 * @param playingPanel the playingPanel to set
	 */
	public void setPlayingPanel(PlayingPanel playingPanel) {
		this.playingPanel = playingPanel;
	}

	/**
	 * @return the board
	 */
	public BoardPanel getBoard() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(BoardPanel board) {
		this.board = board;
	}

}
