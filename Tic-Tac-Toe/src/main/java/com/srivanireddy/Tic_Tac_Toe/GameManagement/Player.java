package com.srivanireddy.Tic_Tac_Toe.GameManagement;

public class Player extends User{

	private final Symbol symbol;
	
	public Player(String userName, String userId, Symbol symbol) {
		super(userName, userId);
		this.symbol = symbol;
	}

	public Symbol getSymbol() {
		return symbol;
	}

}

