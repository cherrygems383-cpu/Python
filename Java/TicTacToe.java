import java.util.Scanner;
public class TicTacToe {
    public static void main(String... args) { 
    
        char[][] board = new char[3][3];
        
        
        char player = 'X';
        boolean endGame = false;
        Scanner input = new Scanner(System.in); 
        
        while(!endGame) {
          theBoard(board);
          System.out.print("Player " + player + " enter: ");
          int row = input.nextInt();
          int column = input.nextInt();
          
          if(board[row][column] != 'X' && board[row][column]!= 'O') {
           board[row][column] = player;
           endGame = won(board, player);
            
            if(endGame) {
              System.out.print("Player " + player + " has won: ");
              }
              else {
                if(player == 'X') {
                  player = 'O';
                  }
                  else {
                    player = 'X';
                    }
                }
            }
            else {
              System.out.println("Invalid. Try Again!");
            }
        }
        theBoard(board);
    }
        
    public static boolean won(char[][] board, char player) {
      for(int row = 0; row < board.length; row++) {
        if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
          return true;
      }
    }
    
    for(int column = 0; column < board.length; column++) {
        if(board[0][column] == player && board[1][column] == player && board[2][column] == player) {
          return true;
        }
      }
      
      if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
        return true;
        }
        if(board[0][2] == player && board[1][1] == player &&board[2][0] == player) {
        return true;
      }
      return false;
    }
  
    public static void theBoard(char[][] board) { 
      for(int row = 0; row < 3; row++) {
          System.out.print(" " + board[row][0] + " | " + board[row][1] + " | " + board[row][2]);
          System.out.println();
          if(row < 2) {
              System.out.println("---+---+---");
        } 
    }
}
  }
