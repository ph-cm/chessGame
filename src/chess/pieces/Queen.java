package chess.pieces;

import boadGame.Board;
import boadGame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece{

	public Queen(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//above
		p.setValues(position.getRow() - 1, position.getColunm());
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}
		
		//left
		p.setValues(position.getRow(), position.getColunm() - 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setColunm(p.getColunm() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}
		
		//right
		p.setValues(position.getRow(), position.getColunm() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setColunm(p.getColunm() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}
		
		//below
		p.setValues(position.getRow() + 1, position.getColunm());
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}
		
		//nw
				p.setValues(position.getRow() - 1, position.getColunm() - 1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColunm()] = true;
					p.setValues(p.getRow() - 1, p.getColunm() - 1);
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColunm()] = true;
				}
				
				//ne
				p.setValues(position.getRow() - 1, position.getColunm() + 1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColunm()] = true;
					p.setValues(p.getRow() - 1, p.getColunm() + 1);
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColunm()] = true;
				}
				
				//se
				p.setValues(position.getRow() + 1, position.getColunm() + 1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColunm()] = true;
					p.setValues(p.getRow() + 1, p.getColunm() + 1);
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColunm()] = true;
				}
				
				//sw
				p.setValues(position.getRow() + 1, position.getColunm() - 1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColunm()] = true;
					p.setValues(p.getRow() + 1, p.getColunm() - 1);
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColunm()] = true;
				}
		return mat;
	}

}
