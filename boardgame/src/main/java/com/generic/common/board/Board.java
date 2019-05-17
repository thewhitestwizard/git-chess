package com.generic.common.board;

import com.generic.common.contract.BoardInfo;
import com.generic.common.contract.BoardType;
import com.generic.engine.BoardEngine;

public abstract class Board implements BoardType{

	private boolean hasTiles;
	private boolean hasPieces; 	
	
	public Board(BoardInfo boardInfo) {
		this.hasTiles = boardInfo.hasTiles();
		this.hasPieces = boardInfo.hasPieces();
	}
	
	public abstract void setBoardEngine(BoardEngine boardEngine);
		
	
	
}
