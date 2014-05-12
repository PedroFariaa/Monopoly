package logic;

import java.util.Vector;

public class Game {
	private Board board;
	private Vector<Player> players;

	public Vector<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Vector<Player> players) {
		this.players = players;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
