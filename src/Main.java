import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][] square = new int[4][4];
        Scanner sc = new Scanner(System.in);

        // Collect 16 inputs
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter number for square[" + i + "][" + j + "]: ");
                square[i][j] = sc.nextInt();
            }
        }

        Server server = new Server(square);
        if (server.isMagicSquare()) {
            System.out.println("The numbers entered form a magic square.");
        } else {
            System.out.println("The numbers entered do not form a magic square.");
        }
    }
}
