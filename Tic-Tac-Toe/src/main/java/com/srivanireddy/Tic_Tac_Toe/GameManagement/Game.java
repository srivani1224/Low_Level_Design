package com.srivanireddy.Tic_Tac_Toe.GameManagement;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Game implements GameFeatures {

	private Board board;

	private Queue<Player> userTurns = new LinkedList<>();
	private List<Moves> moves = new LinkedList<>();
	
	private int boardSize;
	
	public int rows[];
	public int cols[]; 
	public int diagCount = 0;
	public int antiDiagCount = 0;
	public int rowCount = 0;
	public int columnCount = 0;
	
	Player p1 , p2;
	
	Scanner scn = new Scanner(System.in);
	
	public Game(Board board){
        p1 = new Player("Alex", "1", Symbol.ZERO);
        p2 = new Player("Bob", "2", Symbol.CROSS);
        board.setGameStatus(GameStatus.ONGOING);

        userTurns.add(p1);
        userTurns.add(p2);
        
        System.out.println(board.getBoardSize());
        this.board = board;
        boardSize = board.getBoardSize();
        this.rows = new int[boardSize];
        this.cols = new int[boardSize];

	 }
	
	@Override
	public void judge() {
		
		if (Math.abs(rowCount) == boardSize || Math.abs(columnCount) == boardSize || Math.abs(diagCount) == boardSize  || Math.abs(antiDiagCount) == boardSize) 
		{
            board.setGameStatus(GameStatus.WIN);
            return;
	    }
		
		if(moves.size() == boardSize * boardSize)
		{
			board.setGameStatus(GameStatus.DRAW);
            return;
		}
		
		
	}
	
	@Override
	public void announceTurn(Player p) {
		System.out.println( p.getUserName() + " Turn!" + p.getSymbol() + "is Symbol!");
	
	}
	
	@Override
	public Cell makeChoice(Player p) {
		System.out.println( p.getUserName() + " Please enter rowIndex :");
		int rowIndex = scn.nextInt();
		System.out.println( p.getUserName() + " Please enter columnIndex :");
		int columnIndex = scn.nextInt();
		return new Cell(rowIndex, columnIndex);	
	}
	
	@Override
	public Boolean isValid(Cell choice) {

		int rowIndex = choice.getRowIndex();
		int columnIndex = choice.getColumnIndex();
		
		if(rowIndex < 0 || rowIndex >= board.getBoardSize())
			return false;
		
		if(columnIndex < 0 || columnIndex >= board.getBoardSize())
			return false;
		
		if(board.getBoard()[rowIndex][columnIndex] != Symbol.EMPTY.getValue())
			return false;
		
		return true;
	}
	
	@Override
	public void doChanges(Cell choice, Player p) {
		
		Character symbol = p.getSymbol().getValue();
		int rowIndex = choice.getRowIndex();
		int columnIndex = choice.getColumnIndex();
		
		board.getBoard()[rowIndex][columnIndex] = symbol;
		
		getUserTurns().add(p);
		Moves move = new Moves(p, rowIndex, rowIndex);
		moves.add(move);
		
		judge();
	}
	
	@Override
	public void modifyCount(Cell choice, Player p) {

		int rowIndex = choice.getRowIndex();
		int columnIndex = choice.getColumnIndex();
		int toAdd = (p.getSymbol() == Symbol.CROSS) ? +1 : -1;
		
		rows[rowIndex] += toAdd;
		cols[columnIndex] += toAdd;
		
		rowCount = rows[rowIndex];
		columnCount = cols[columnIndex];
		
		if(rowIndex == columnIndex)
		{
			diagCount += toAdd;
		}
		if(rowIndex + columnIndex == boardSize -1 )
		{
			antiDiagCount += toAdd; 
		}
		
	}
	
	@Override
	public void makeMove() {
		
		Player p = getUserTurns().poll();
		announceTurn(p);
		
		Cell choice = makeChoice(p);
		
		while(!isValid(choice))
		{
			System.out.println("Invalid Input.. Please enter valid input !!");
			choice = makeChoice(p);
		}
		
		doChanges(choice, p);
		modifyCount(choice, p);
	}

	public Queue<Player> getUserTurns() {
		return userTurns;
	}

	public void setUserTurns(Queue<Player> userTurns) {
		this.userTurns = userTurns;
	}
	

}
