package com.generic.engine;

import com.generic.common.board.Board;
import com.generic.rule.factory.RuleBoardInterfaceFacilitator;

public interface BoardEngine<T extends Board> {

	RuleBoardInterfaceFacilitator<T> getRuleFactory(); 
	
}
