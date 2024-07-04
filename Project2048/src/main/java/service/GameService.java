package main.java.service;

import java.util.List;
import java.util.Random;

public class GameService {

	private Random rand;
	public GameService() {
		rand=new Random();
	}
	public void insertElementAtRandom(List<int[]> availableCells, int[][] gameBoard) {
		int[] cell= availableCells.get(rand.nextInt(availableCells.size()));
		int randomNum = generateRandomNumber();
		gameBoard[cell[0]][cell[1]]=randomNum;
	}
	private int generateRandomNumber() {
		return (int)Math.pow(2, rand.nextInt(11));
	}
	public void printGameBoard(int[][] gameBoard) {
		System.out.println();
		System.out.println();
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int ele=gameBoard[i][j];
				if(ele==0) {
					System.out.print("--  ");
				} else {
					System.out.print(ele+"  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	public void moveGameBoard(int[][] gameBoard, int move) {
		if(move==1) {
			moveLeft(gameBoard);
		} else if(move==2) {
			moveRight(gameBoard);
		} else if(move==3) {
			moveUp(gameBoard);
		} else if(move==4) {
			moveDown(gameBoard);
		} else {
			System.out.println("Invalid move");
		}
	}
	private void moveDown(int[][] gameBoard) {
		for(int j=3;j>=0;j--) {
			if(gameBoard[j][0]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==3)break;
				if(!f && gameBoard[i][0]==gameBoard[i+1][0]) {
					gameBoard[i+1][0]*=2;
					gameBoard[i][0]=0;
					f=true;
				} else if(gameBoard[i+1][0]==0) {
					gameBoard[i+1][0]=gameBoard[i][0];
					gameBoard[i][0]=0;
				} else {
					break;
				}
				++i;
			}
		}
		for(int j=3;j>=0;j--) {
			if(gameBoard[j][1]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==3)break;
				if(!f && gameBoard[i][1]==gameBoard[i+1][1]) {
					gameBoard[i+1][1]*=2;
					gameBoard[i][1]=0;
					f=true;
				} else if(gameBoard[i+1][1]==0) {
					gameBoard[i+1][1]=gameBoard[i][1];
					gameBoard[i][1]=0;
				} else {
					break;
				}
				++i;
			}
		}
		for(int j=3;j>=0;j--) {
			if(gameBoard[j][2]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==3)break;
				if(!f && gameBoard[i][2]==gameBoard[i+1][2]) {
					gameBoard[i+1][2]*=2;
					gameBoard[i][2]=0;
					f=true;
				} else if(gameBoard[i+1][2]==0) {
					gameBoard[i+1][2]=gameBoard[i][2];
					gameBoard[i][2]=0;
				} else {
					break;
				}
				++i;
			}
		}
		for(int j=3;j>=0;j--) {
			if(gameBoard[j][3]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==3)break;
				if(!f && gameBoard[i][3]==gameBoard[i+1][3]) {
					gameBoard[i+1][3]*=2;
					gameBoard[i][3]=0;
					f=true;
				} else if(gameBoard[i+1][3]==0) {
					gameBoard[i+1][3]=gameBoard[i][3];
					gameBoard[i][3]=0;
				} else {
					break;
				}
				++i;
			}
		}
	}
	private void moveUp(int[][] gameBoard) {
		for(int j=0;j<4;j++) {
			if(gameBoard[j][0]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==0)break;
				if(!f && gameBoard[i][0]==gameBoard[i-1][0]) {
					gameBoard[i-1][0]*=2;
					gameBoard[i][0]=0;
					f=true;
				} else if(gameBoard[i-1][0]==0) {
					gameBoard[i-1][0]=gameBoard[i][0];
					gameBoard[i][0]=0;
				} else {
					break;
				}
				--i;
			}
		}
		for(int j=0;j<4;j++) {
			if(gameBoard[j][1]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==0)break;
				if(!f && gameBoard[i][1]==gameBoard[i-1][1]) {
					gameBoard[i-1][1]*=2;
					gameBoard[i][1]=0;
					f=true;
				} else if(gameBoard[i-1][1]==0) {
					gameBoard[i-1][1]=gameBoard[i][1];
					gameBoard[i][1]=0;
				} else {
					break;
				}
				--i;
			}
		}
		for(int j=0;j<4;j++) {
			if(gameBoard[j][2]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==0)break;
				if(!f && gameBoard[i][2]==gameBoard[i-1][2]) {
					gameBoard[i-1][2]*=2;
					gameBoard[i][2]=0;
					f=true;
				} else if(gameBoard[i-1][2]==0) {
					gameBoard[i-1][2]=gameBoard[i][2];
					gameBoard[i][2]=0;
				} else {
					break;
				}
				--i;
			}
		}
		for(int j=0;j<4;j++) {
			if(gameBoard[j][3]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==0)break;
				if(!f && gameBoard[i][3]==gameBoard[i-1][3]) {
					gameBoard[i-1][3]*=2;
					gameBoard[i][3]=0;
					f=true;
				} else if(gameBoard[i-1][3]==0) {
					gameBoard[i-1][3]=gameBoard[i][3];
					gameBoard[i][3]=0;
				} else {
					break;
				}
				--i;
			}
		}
	}
	private void moveRight(int[][] gameBoard) {

		for(int j=3;j>=0;j--) {
			if(gameBoard[0][j]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==3)break;
				if(!f && gameBoard[0][i]==gameBoard[0][i+1]) {
					gameBoard[0][i+1]*=2;
					gameBoard[0][i]=0;
					f=true;
				} else if(gameBoard[0][i+1]==0) {
					gameBoard[0][i+1]=gameBoard[0][i];
					gameBoard[0][i]=0;
				} else {
					break;
				}
				++i;
			}
		}
		for(int j=3;j>=0;j--) {
			if(gameBoard[1][j]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==3)break;
				if(!f && gameBoard[1][i]==gameBoard[1][i+1]) {
					gameBoard[1][i+1]*=2;
					gameBoard[1][i]=0;
					f=true;
				} else if(gameBoard[1][i+1]==0) {
					gameBoard[1][i+1]=gameBoard[1][i];
					gameBoard[1][i]=0;
				} else {
					break;
				}
				++i;
			}
		}
		for(int j=3;j>=0;j--) {
			if(gameBoard[2][j]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==3)break;
				if(!f && gameBoard[2][i]==gameBoard[2][i+1]) {
					gameBoard[2][i+1]*=2;
					gameBoard[2][i]=0;
					f=true;
				} else if(gameBoard[2][i+1]==0) {
					gameBoard[2][i+1]=gameBoard[2][i];
					gameBoard[2][i]=0;
				} else {
					break;
				}
				++i;
			}
		}
		for(int j=3;j>=0;j--) {
			if(gameBoard[3][j]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==3)break;
				if(!f && gameBoard[3][i]==gameBoard[3][i+1]) {
					gameBoard[3][i+1]*=2;
					gameBoard[3][i]=0;
					f=true;
				} else if(gameBoard[3][i+1]==0) {
					gameBoard[3][i+1]=gameBoard[3][i];
					gameBoard[3][i]=0;
				} else {
					break;
				}
				++i;
			}
		}
	
	}
	private void moveLeft(int[][] gameBoard) {
		for(int j=0;j<4;j++) {
			if(gameBoard[0][j]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==0)break;
				if(!f && gameBoard[0][i]==gameBoard[0][i-1]) {
					gameBoard[0][i-1]*=2;
					gameBoard[0][i]=0;
					f=true;
				} else if(gameBoard[0][i-1]==0) {
					gameBoard[0][i-1]=gameBoard[0][i];
					gameBoard[0][i]=0;
				} else {
					break;
				}
				--i;
			}
		}
		for(int j=0;j<4;j++) {
			if(gameBoard[1][j]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==0)break;
				if(!f && gameBoard[1][i]==gameBoard[1][i-1]) {
					gameBoard[1][i-1]*=2;
					gameBoard[1][i]=0;
					f=true;
				} else if(gameBoard[1][i-1]==0) {
					gameBoard[1][i-1]=gameBoard[1][i];
					gameBoard[1][i]=0;
				} else {
					break;
				}
				--i;
			}
		}
		for(int j=0;j<4;j++) {
			if(gameBoard[2][j]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==0)break;
				if(!f && gameBoard[2][i]==gameBoard[2][i-1]) {
					gameBoard[2][i-1]*=2;
					gameBoard[2][i]=0;
					f=true;
				} else if(gameBoard[2][i-1]==0) {
					gameBoard[2][i-1]=gameBoard[2][i];
					gameBoard[2][i]=0;
				} else {
					break;
				}
				--i;
			}
		}
		for(int j=0;j<4;j++) {
			if(gameBoard[3][j]==0)continue;
			int i=j;
			boolean f=false;
			while(true) {
				if(i==0)break;
				if(!f && gameBoard[3][i]==gameBoard[3][i-1]) {
					gameBoard[3][i-1]*=2;
					gameBoard[3][i]=0;
					f=true;
				} else if(gameBoard[3][i-1]==0) {
					gameBoard[3][i-1]=gameBoard[3][i];
					gameBoard[3][i]=0;
				} else {
					break;
				}
				--i;
			}
		}
	}
	public boolean boardContains2048(int[][] gameBoard) {
		for(int i=0;i<=3;i++) {
			for(int ele:gameBoard[i]) {
				if(ele==2048)return true;
			}
		}
		return false;
	}

}
