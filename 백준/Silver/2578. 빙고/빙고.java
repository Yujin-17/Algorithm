
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] bingoBoard = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                bingoBoard[i][j] = scanner.nextInt();
            }
        }

        int[] num = new int[25];
        for(int i = 0; i < 25; i++) {
            num[i] = scanner.nextInt();
        }

        for(int i = 0; i < 25; i++) {
            markNumber(bingoBoard, num[i]);

            if(countBingo(bingoBoard) >= 3) {
                System.out.println(i + 1);;
                break;
            }
        }


     }

     private static void markNumber(int[][] board, int num) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(board[i][j] == num) {
                    board[i][j] = 0;
                    return;
                }
            }
        }
     }

     private static int countBingo(int[][] board) {
        int count = 0;

        for(int i = 0; i < 5; i++) {
            boolean isBingo = true;
            for(int j = 0; j < 5; j++) {
                if(board[i][j] != 0) {
                    isBingo = false;
                    break;
                }
            }
            if(isBingo) count++;
        }

         for (int j = 0; j < 5; j++) {
             boolean isBingo = true;
             for (int i = 0; i < 5; i++) {
                 if (board[i][j] != 0) {
                     isBingo = false;
                     break;
                 }
             }
             if (isBingo) count++;
         }

         boolean isDiagonal1 = true;
         for (int i = 0; i < 5; i++) {
             if (board[i][i] != 0) {
                 isDiagonal1 = false;
                 break;
             }
         }
         if (isDiagonal1) count++;

         boolean isDiagonal2 = true;
         for (int i = 0; i < 5; i++) {
             if (board[i][4 - i] != 0) {
                 isDiagonal2 = false;
                 break;
             }
         }
         if (isDiagonal2) count++;

         return count;

     }
}
