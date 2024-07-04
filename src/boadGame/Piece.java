package boadGame;

public class Piece {

	protected Position position;
	private Board board;
	
	//just the board bc the position statrts null
	public Piece(Board board) {
		super();
		this.board = board;
		position = null;
	}

	//just class in the same package or subClass can acess the board 
	protected Board getBoard() {
		return board;
	}
	//the board is inalterated so, doesn't have the setter
	
	
}
