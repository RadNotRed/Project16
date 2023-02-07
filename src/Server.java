class Server {
    private int[][] square;

    public Server(int[][] square) {
        this.square = square;
    }

    public boolean isMagicSquare() {
        return (rowsAreEqual() && columnsAreEqual() && diagonalsAreEqual());
    }

    private boolean rowsAreEqual() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += square[i][j];
            }
            if (sum != 34) {
                return false;
            }
        }
        return true;
    }

    private boolean columnsAreEqual() {
        int sum = 0;
        for (int j = 0; j < 4; j++) {
            sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += square[i][j];
            }
            if (sum != 34) {
                return false;
            }
        }
        return true;
    }

    private boolean diagonalsAreEqual() {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 4; i++) {
            sum1 += square[i][i];
            sum2 += square[i][3 - i];
        }
        return (sum1 == 34 && sum2 == 34);
    }
}
