package gui;

import java.util.Vector;

import javax.swing.JFrame;

import logic.Game;
import logic.Player;

public class GameFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BoardPanel board;
	private PlayingPanel playingPanel;
	private PlayersPanel playersPanel;
	Game g;

	/**
	 * Creates the Frame
	 * @param mode
	 * @param players
	 */
	public GameFrame(Vector<Player> players, String mode){
		
		g = new Game(mode, players);
		
		setResizable(false);
		setTitle("Monopoly Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1200,700);
		
		board = new BoardPanel();
		board.setSize(671, 671);
		playingPanel = new PlayingPanel(g);
		playingPanel.setSize(264,671);
		playersPanel = new PlayersPanel(g);
		playersPanel.setSize(265,671);
		getContentPane().setLayout(null);
		
		getContentPane().add(board);
		getContentPane().add(playersPanel);
		getContentPane().add(playingPanel);
		
		board.setLocation(265, 0);
		playersPanel.setLocation(0, 0);
		playingPanel.setLocation(936, 0);
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
