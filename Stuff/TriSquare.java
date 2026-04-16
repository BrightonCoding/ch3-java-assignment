public class TriSquare {
    public static void main(String[] args) {
        //Initialize variables
        int size = 13;
        int triHeight = (size+1)/2;

        // Draw triangle
        for (int row = 0; row < triHeight; row++) {
            for (int col = 0; col < size; col++) {
                if (col == (size / 2) - row || col == (size / 2) + row)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Draw square
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1 || col == 0 || col == size - 1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

