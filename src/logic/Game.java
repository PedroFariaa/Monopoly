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
		//constroi tabuleiro
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

	private void PlayGamePC(int n_players) {
		// TODO Auto-generated method stub
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void main (int argc){
		Game g = new Game();
	}

	private Game() {
		board = Board();
		players = Players();
	}

	private Vector<Player> Players() {
		// TODO Auto-generated method stub
		return null;
	}

	private Vector<Space> Board() {
		Go space0 = new Go();
		board.add(space0);
		//finish property's constructor
		Property space1 = new Property();
		board.add(space1);
	}
}
