package com.srivanireddy.Tic_Tac_Toe.GameManagement;

public enum GameStatus {
	
	WIN("Congratulations!"),
	DRAW("IT's a Draw!!"),
	ONGOING("The Game is still on..");
	
	private String val;
	GameStatus(String val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
	public String getVal() {
		return val;
	}
	
}
