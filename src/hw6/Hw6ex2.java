package hw6;
import java.util.Scanner;

public class Hw6ex2 {
    public static void main(String[] args) {
    int[][] board = new int[5][5];
    int targetRow = (int) (Math.random() * 5);
    int targetCol = (int) (Math.random() * 5);

    System.out.println("All Set. Get ready to rumble!");



    while (true) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row number (1-5): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Enter column number (1-5): ");
        int col = scanner.nextInt() - 1;

        if (row < 0 || row > 4 || col < 0 || col > 4) {
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
            continue;
        }

        if (board[row][col] == 1 || board[row][col] == 2) {
            System.out.println("You already shot there. Please choose another cell.");
            continue;
        }

        if (row == targetRow && col == targetCol) {
            board[row][col] = 2;
            System.out.println("You have won!");
            break;
        } else {
            board[row][col] = 1;
            System.out.println("Missed!");
        }

        System.out.println("   1 2 3 4 5");
        System.out.println("  +-+-+-+-+-+");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 0) {
                    System.out.print(" |");
                } else if (board[i][j] == 1) {
                    System.out.print("*|");
                } else {
                    System.out.print("x|");
                }
            }
            System.out.println();
            System.out.println("  +-+-+-+-+-+");
        }
    }
    }
}
