package boadGame;

public class Position {

	int row;
	int column;
	
	public Position(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColunm() {
		return column;
	}

	public void setColunm(int column) {
		this.column = column;
	}

	public void setValues(int row , int column) {
		this.row = row;
		this.column = column;
	}
	@Override
	public String toString(){
		
		return row + ", " + column;
	}
}
