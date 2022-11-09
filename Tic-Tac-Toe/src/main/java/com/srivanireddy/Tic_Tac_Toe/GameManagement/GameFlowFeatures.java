package com.srivanireddy.Tic_Tac_Toe.GameManagement;

public interface GameFlowFeatures {

	void run();
	GameStatus getGameStatus();
	void announceWinner();
	
}
