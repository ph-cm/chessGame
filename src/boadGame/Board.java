package boadGame;

public class Board {
	
	private int row;
	private int columns;
	
	private Piece[][] piecies;

	public Board(int row, int columns) {
		super();
		this.row = row;
		this.columns = columns;
		piecies = new Piece[row][columns];
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row , int column) {
		return piecies[row][column];
	}
	
	public Piece piece(Position position) {
		return piecies[position.getRow()][position.getColunm()];
	}
	
	public void placePiece(Piece piece, Position position) {
		piecies[position.getRow()][position.getColunm()] = piece;
		piece.position = position;
	}
}
