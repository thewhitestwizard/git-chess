package com.generic.rule.factory;

import com.generic.common.board.Board;
import com.generic.engine.BoardEngine;

public class RuleBoardInterfaceFacilitator<T extends Board> {

	public void initialiseRuleBoardInterface(T t) {
		t.setBoardEngine(findAppropriateEngine(t));
	}
	
	private BoardEngine<T> findAppropriateEngine(final T t) {
		
			return new BoardEngine<T>() {

				public RuleBoardInterfaceFacilitator<T> getRuleFactory() {
					return null;
				}
				
			};
		}
	
}
