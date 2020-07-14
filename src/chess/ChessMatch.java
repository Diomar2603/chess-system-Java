package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column,row).toPosition());
	}
	
	
	private void initialSetup() {
		
		//linha de tras das peças brancas//
		
		placeNewPiece('a',1,new Rook(board, Color.WHITE));
		placeNewPiece('h',1,new Rook(board, Color.WHITE));
		placeNewPiece('e',1,new King(board, Color.WHITE));
		placeNewPiece('d',1,new Queen(board, Color.WHITE));
		placeNewPiece('c',1,new Bishop(board, Color.WHITE));
		placeNewPiece('f',1,new Bishop(board, Color.WHITE));
		placeNewPiece('g',1,new Knight(board, Color.WHITE));
		placeNewPiece('b',1,new Knight(board, Color.WHITE));
		
		//linha de tras das peças pretas//
	
		
		
	}
	
}