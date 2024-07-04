package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.service.GameService;

public class Main {

	private static GameService gameService;
	private static int[][] gameBoard;
	private static List<int[]> availableCells;
	public static void main(String[] args) {
		System.out.println("Project 2048 started");
		gameBoard=new int[4][4];
		gameService=new GameService();
		fillAvailableCells(gameBoard);
		Scanner in=new Scanner(System.in);
		insertElementAtRandom();
		printGameBoard();
		while(true) {
			System.out.println("Enter 1-4 to move or exit to stop");
			String input = in.nextLine();
			if(input.equals("exit"))break;
			moveGameBoard(Integer.parseInt(input));
			fillAvailableCells(gameBoard);
			if(boardContains2048()) {
				System.out.println("Game won!");
				break;
			}
			if(noAvailableCell()) {
				System.out.println("Game Over!");
				break;
			}
			insertElementAtRandom();
			printGameBoard();
		}
		System.out.println("Project 2048 stopped");
	}
	private static boolean noAvailableCell() {
		return availableCells.isEmpty();
	}
	private static boolean boardContains2048() {
		return gameService.boardContains2048(gameBoard);
	}
	private static void moveGameBoard(int move) {
		gameService.moveGameBoard(gameBoard, move);
	}
	private static void printGameBoard() {
		gameService.printGameBoard(gameBoard);
	}
	private static void insertElementAtRandom() {
		gameService.insertElementAtRandom(availableCells, gameBoard);
	}
	private static void fillAvailableCells(int[][] gameBoard2) {
		availableCells=new ArrayList<int[]>();
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(gameBoard2[i][j]!=0)continue;
				availableCells.add(new int[] {i, j});
			}
		}
	}

}
