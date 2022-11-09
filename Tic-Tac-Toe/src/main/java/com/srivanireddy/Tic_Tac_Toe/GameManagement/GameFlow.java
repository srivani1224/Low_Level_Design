package com.srivanireddy.Tic_Tac_Toe.GameManagement;

import java.util.LinkedList;
import java.util.Queue;

public class GameFlow implements GameFlowFeatures {
	
	private Board gameBoard;
	private Game game;
	

	public GameFlow(Game game, Board gameBoard) {
		this.game = game;
		this.gameBoard = gameBoard;
	}

	@Override
	public void run() {
		
		while(true)
		{
			game.makeMove();
	
	        System.out.println("======== BOARD ========");
	
	        gameBoard.display();
	
	        System.out.println("======== BOARD ========");
			
	        game.judge();
	        
	        if(gameBoard.getGameStatus() == GameStatus.DRAW)
	        {
	        	System.out.println(gameBoard.getGameStatus().getVal());
	        	break;
	        }
	        
	        if(gameBoard.getGameStatus() == GameStatus.WIN)
	        {
	        	announceWinner();
	        	break;
	        }
		}
	}

	@Override
	public GameStatus getGameStatus() {

		return gameBoard.getGameStatus();
	}

	@Override
	public void announceWinner() {
		
		game.getUserTurns().poll();
		Player p = game.getUserTurns().poll();
		System.out.println("Winner is " + p.getUserName() + " - " + p.getSymbol());
	}
}
