import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };
        Opt game = new Opt();
        char p = 'X';
        while (true) {
            game.printBoard(board);
            System.out.print("Player " + p + " Enter Position : ");
            int n = sc.nextInt();
            if (game.placeSymbol(board, n, p)==false ) {
                System.out.println("Invalid Move! Try Again.");
                continue;
            }
            if (game.checkWinner(board, p)) {
                game.printBoard(board);
                System.out.println("Player " + p + " Wins!");
                break;
                }
                else 
                  {
                    System.out.println(" Match Tai ");
                  }
            if (p =='X') {
                p ='O';
            } else {
                p ='X';
            }
        }
        sc.close();
    }
}