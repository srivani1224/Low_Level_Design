package com.srivanireddy.Tic_Tac_Toe.GameManagement;

public interface GameFeatures {
	
	public void judge();
    void announceTurn(Player p);
    Cell makeChoice(Player p);
    Boolean isValid(Cell choice);
    void doChanges(Cell choice , Player p);
    void makeMove();
    void modifyCount(Cell choice , Player p);
	
}
