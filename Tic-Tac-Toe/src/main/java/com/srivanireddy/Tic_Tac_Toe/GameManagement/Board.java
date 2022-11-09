package com.srivanireddy.Tic_Tac_Toe.GameManagement;

public class Board implements BoardFeatures {

	private Character [][] board ;
	private int boardSize;
	private GameStatus gameStatus = GameStatus.ONGOING;
	
	
	public Board(int boardSize) {
		this.boardSize = boardSize;
	}

	@Override
	public void initialize() {
		
		board = new Character[boardSize + 1][boardSize + 1];
		
		for(int i=0; i<boardSize; i++)
		{
			for(int j=0; j<boardSize; j++)
			{
				board[i][j] = Symbol.EMPTY.getValue();
			}
		}
		
	}

	@Override
	public void display() {
		
		for(int i=0; i<boardSize; i++)
		{
			for(int j=0; j<boardSize; j++)
			{
				System.out.print(getBoard()[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public Character[][] getBoard() {
		return board;
	}

	public void setBoard(Character board[][]) {
		this.board = board;
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

}
