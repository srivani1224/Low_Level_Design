package com.srivanireddy.Tic_Tac_Toe.GameManagement;

public class Moves {

	private Player player;
	private int rowIndex;
	private int columnInidex;
	
	public Moves(Player player, int rowIndex, int columnInidex) {
		super();
		this.player = player;
		this.rowIndex = rowIndex;
		this.columnInidex = columnInidex;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public int getRowIndex() {
		return rowIndex;
	}
	
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	
	public int getColumnInidex() {
		return columnInidex;
	}
	
	public void setColumnInidex(int columnInidex) {
		this.columnInidex = columnInidex;
	}
	
	
}
