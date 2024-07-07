package boadGame;

public abstract class Piece {

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
	
	//possible moves
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColunm()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i<mat.length;i++) {
			for(int j = 0; j<mat.length;j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
