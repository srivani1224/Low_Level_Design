package com.srivanireddy.Tic_Tac_Toe.GameManagement;

public class Cell {

	int rowIndex;
	int columnIndex;
	
	public Cell(int rowIndex, int columnIndex) {
		super();
		this.rowIndex = rowIndex;
		this.columnIndex = columnIndex;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}
	
	
}
