package logic;

import java.util.Vector;

import logic.Space;

public class Game {
	private Vector<Player> players;
	private Vector<Space> board;
	private String tipo;

	public void setBoard(Vector<Space> board) {
		this.board = board;
	}

	public Vector<Space> getBoard() {
		return board;
	}
	
	public String DisplayBoard() {
		return "Board [board=" + board + "]";
	}
	
	public Vector<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Vector<Player> players) {
		this.players = players;
	}

	public Game(String tipo, int n_players){
		//constroi boarduleiro
		//inicializa os jogadores
		PlayGamePC(n_players);
		PlayGamePlayers(n_players);
		PlayGameRede();
	}

	private void PlayGameRede() {
		// TODO Auto-generated method stub
		
	}

	private void PlayGamePlayers(int n_players) {
		// TODO Auto-generated method stub
		
	}

	public void PlayGamePC(int n_players) {
		// TODO Auto-generated method stub
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Game() {
		this.board = Board();
		players = Players();
	}

	private Vector<Player> Players() {
		// TODO Auto-generated method stub
		return null;
	}

	private Vector<Space> Board() {
		Space space0 = new Go();
		board.add(space0);
		Property space1 = new Property("casa barata","blue",120, 3, 12, 25, 33, 42,60);
		board.add(space1);

		return this.board;
	}
}
