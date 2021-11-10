public class Matrix {

    public static void main(String[] args){

//      Applications of arrays: vector[2D Array] and matrix calculations[2D Array]
//      Mathematical Abstraction: Vector
//      Java Implementation: 2D Array

//        Matrix Addition

        int N = Integer.parseInt(args[0]);

        double[][] a = {
                        {0.70, 0.20, .10},
                        {0.30, 0.60, .10},
                        {0.50, 0.10, .40}
                      };

        double[][] b = {
                        {0.80, 0.30, .50},
                        {0.10, 0.40, .10},
                        {0.10, 0.30, .40}
                       };

        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println("Matrix Addition: " + c[i][j]);
            }

//      Matrix Multiplication

        double[][] d = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++){
                    d[i][j] += a[i][k] * b[k][j];
                    System.out.println("Matrix Multiplication: " + d[i][j]);
                }


    }
}
