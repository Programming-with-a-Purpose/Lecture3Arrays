import java.util.Arrays;

public class RectangularMatrices {

    public static void main(String[] args) {

//        Optional Enrichment Exercise
//        Write a code fragment to multiply two rectangular matrices that are not necessarily square.
//        Note: For the dot product to be well-defined, the number of columns in the
//        first matrix must be equal to the number of rows in the second matrix.
//        Print an error message if the dimensions do not satisfy this condition.

        int[][] a = {
                {2, 3, 6},
                {7, 9, 1},
                {4, 8, 5}
        };

        int[][] b = {
                {1},
                {2},
                {3}
        };

        for (int i = 0; i < b.length; i++) {
            System.out.println(" b Array's Length: " + b.length);
            System.out.println(Arrays.toString(b[i]));
        }

        int c[][] = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[j].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    System.out.println("Matrix Multiplication: " + c[i][j]);
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(" c Array's Length: " + c.length);
            System.out.println(Arrays.toString(c[i]));
        }

    }
}
