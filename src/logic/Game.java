package logic;

import java.util.Vector;

import logic.Space;

public class Game {
	private Vector<Player> players;
	private Vector<Space> board = new Vector<Space>();
	private String tipo;

	public void setBoard(Vector<Space> board) {
		this.board = board;
	}

	public Vector<Space> getBoard() {
		return board;
	}
		
	public Vector<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Vector<Player> players) {
		this.players = players;
	}

	public Game(String tipo, Vector<Player> players){
		//constroi boarduleiro
		//inicializa os jogadores
		this.board = Board();
		this.tipo=tipo;
		this.players = players;
		/*PlayGamePC(players);
		PlayGamePlayers(players);
		PlayGameRede();*/
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
		Property space1 = new Property("CASTELO BRANCO","BROWN", 60, 2, 10, 30, 90, 160, 250, 50);
		board.add(space1);
		Community space2 = new Community();
		board.add(space2);
		Property space3 = new Property("VILA REAL","BROWN", 60, 2, 10, 30, 90, 160, 250, 50);
		board.add(space3);
		IncomeTax space4 = new IncomeTax();
		board.add(space4);
		Airport space5 = new Airport(200);
		board.add(space5);
		Property space6 = new Property("BRAGANCA","LIGHT_BLUE", 100, 6, 30, 90, 270, 400, 550, 50);
		board.add(space6);
		Chance space7 = new Chance();
		board.add(space7);
		Property space8 = new Property("LEIRIA","LIGHT_BLUE", 100, 6, 30, 90, 270, 400, 550, 50);
		board.add(space8);
		Property space9 = new Property("PORTALEGRE","LIGHT_BLUE", 120, 8, 40, 100, 300, 450, 600, 50);
		board.add(space9);
		Jail space10 = new Jail();
		board.add(space10);
		
		Property space11 = new Property("SANTAREM","PINK", 140, 10, 50, 150, 450, 625, 750, 100);
		board.add(space11);
		Companies space12 = new Companies(150);
		board.add(space12);
		Property space13 = new Property("AVEIRO","PINK", 140, 10, 50, 150, 450, 625, 750, 100);
		board.add(space13);
		Property space14 = new Property("BRAGA","PINK", 160, 12, 60, 180, 500, 700, 900, 100);
		board.add(space14);
		Airport space15 = new Airport(200);
		board.add(space15);
		Property space16 = new Property("VISEU","ORANGE", 180, 14, 70, 200, 550, 750, 950, 100);
		board.add(space16);
		Community space17 = new Community();
		board.add(space17);
		Property space18 = new Property("SETUBAL","ORANGE", 180, 14, 70, 200, 550, 750, 950, 100);
		board.add(space18);
		Property space19 = new Property("GUARDA","ORANGE", 200, 16, 80, 220, 600, 800, 1000, 100);
		board.add(space19);
		FreeParking space20 = new FreeParking();
		board.add(space20);
		
		Property space21 = new Property("EVORA","RED", 220, 18, 90, 250, 700, 875, 1050, 150);
		board.add(space21);
		Chance space22 = new Chance();
		board.add(space22);
		Property space23 = new Property("BEJA","RED", 220, 18, 90, 250, 700, 875, 1050, 150);
		board.add(space23);
		Property space24 = new Property("VIANA DO CASTELO","RED", 240, 20, 100, 300, 750, 925, 1100, 150);
		board.add(space24);
		Airport space25 = new Airport(200);
		board.add(space25);
		Property space26 = new Property("COIMBRA","YELLOW", 260, 22, 110, 330, 800, 975, 1150, 150);
		board.add(space26);
		Property space27 = new Property("FARO","YELLOW", 260, 22, 110, 330, 800, 975, 1150, 150);
		board.add(space27);
		Companies space28 = new Companies(150);
		board.add(space28);
		Property space29 = new Property("PORTO BOAVISTA","YELLOW", 280, 24, 120, 360, 850, 1025, 1200, 150);
		board.add(space29);
		GoToJail space30 = new GoToJail();
		board.add(space20);
		
		Property space31 = new Property("LISBOA EXPO","GREEN", 300, 26, 130, 390, 900, 1100, 1275, 200);
		board.add(space31);
		Property space32 = new Property("MADEIRA","GREEN", 300, 26, 130, 390, 900, 1100, 1275, 200);
		board.add(space32);
		Community space33 = new Community();
		board.add(space33);
		Property space34 = new Property("ACORES","GREEN", 320, 28, 150, 450, 1000, 1200, 1400, 200);
		board.add(space34);
		Airport space35 = new Airport(200);
		board.add(space35);
		Chance space36 = new Chance();
		board.add(space36);
		Property space37 = new Property("PORTO RIBEIRA","DARK_BLUE", 350, 35, 175, 500, 1100, 1300, 1500, 200);
		board.add(space37);
		IncomeTax space38 = new IncomeTax();
		board.add(space38);
		Property space39 = new Property("LISBOA BELEM","DARK_BLUE", 400, 50, 200, 600, 1400, 1700, 2000, 200);
		board.add(space39);

		return this.board;
	}
}
