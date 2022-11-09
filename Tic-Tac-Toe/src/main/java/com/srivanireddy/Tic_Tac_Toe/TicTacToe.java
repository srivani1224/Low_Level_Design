package com.srivanireddy.Tic_Tac_Toe;

import java.util.Scanner;

import com.srivanireddy.Tic_Tac_Toe.GameManagement.Board;
import com.srivanireddy.Tic_Tac_Toe.GameManagement.Game;
import com.srivanireddy.Tic_Tac_Toe.GameManagement.GameFlow;

public class TicTacToe 
{
    public static void main( String[] args )
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter '1' if you to start a new game else '0' : ");
        int flag = scn.nextInt();
        
        if(flag == 1)
        {
        	System.out.print("please enter boardSize :");
        	int boardSize = scn.nextInt();
        	Board board = new Board(boardSize);
        	board.initialize();
        	board.display();
        	
            Game game = new Game(board);
            GameFlow gameFlow = new GameFlow(game, board);
            gameFlow.run();
        	
        }
        
        else
        {
        	System.out.println("Exit");
        }
        
    }
}
