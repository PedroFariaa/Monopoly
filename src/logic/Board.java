package logic;

import java.util.Vector;

import Spaces.Go;

public class Board {

	private Vector<Space> board;

	public Vector<Space> getBoard() {
		return board;
	}

	public void setBoard(Vector<Space> board) {
		this.board = board;
	}

	public Board(){
		Space space0 = new Go();
		this.board.add(space0);
	}

	@Override
	public String toString() {
		return "Board [board=" + board + "]";
	}
}
