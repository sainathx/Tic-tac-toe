class Opt {

   //  game Bord Printing 
    void printBoard(char[][] board) {
        System.out.println();
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("--+---+--");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("--+---+--");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println();
        
    }

    // For Pacacing Players 
    boolean placeSymbol(char[][] board, int n, char symbol) {
        if (n < 1 || n > 9) {
            return false;
        }
        int r = (n- 1) / 3;
        int c = (n - 1) % 3;
        if (board[r][c] == 'X' || board[r][c] == 'O') {
            return false;
        }
        board[r][c] = symbol;
        return true;
    }

    // Checking Who is Win or Not 
    boolean checkWinner(char[][] a, char s) {
        for (int i = 0; i < 3; i++) {
           if  (a[i][0]== s && a[i][1]== s && a[i][2]== s)
           return true;
        }

         for (int i = 0; i < 3; i++) {
            if (a[0][i]== s && a[1][i]== s && a[2][i]== s)
            return true;
        }

        if (a[0][0]== s && a[1][1]== s && a[2][2]== s)
            return true;
        if (a[0][2]== s && a[1][1]== s && a[2][0]== s)
            return true;
            return false;
    }
}