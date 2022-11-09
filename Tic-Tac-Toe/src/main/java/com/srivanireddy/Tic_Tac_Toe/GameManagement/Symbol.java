package com.srivanireddy.Tic_Tac_Toe.GameManagement;

public enum Symbol {
	
	EMPTY('*'),
    ZERO('O'),
    CROSS('X');
	
    private Character val;

    Symbol(Character val){
        this.val = val;

    }

    public Character getValue() {
        return val;
    }
}
