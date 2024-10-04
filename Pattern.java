public class Pattern {
    public static void main(String[] args)

    {
        int row, column, numberOfRows = 6;
        for (row = 0; row < numberOfRows; row++) {
            for

            (column = numberOfRows - row; column > 1; column--) {
                System.out.print(" ");
            }
            for (column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
