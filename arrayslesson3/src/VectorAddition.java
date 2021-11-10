public class VectorAddition {

    public static void main(String[] args){

//        Applications of arrays: vector[1D Array] and matrix calculations[2D Array]
//        Mathematical Abstraction: Vector
//        Java Implementation: 1D Array


//        Vector Addition

        int N = Integer.parseInt(args[0]);

        double[] a = {0.30, 0.60, .10};
        double[] b = {0.50, 0.10, .40};

        double[] c = new double[N];

        for (int i = 0; i < N; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }

//        Vector Multiplication [a.k.a Dot Product]
        double sum = 0.0;
        for (int i = 0; i < N; i++)
            sum += a[i]*b[i];
        System.out.println("Sum: " + sum);
    }

}
