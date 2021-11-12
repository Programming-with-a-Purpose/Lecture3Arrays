import java.util.Arrays;

public class DiscreteDistribution {

    public static void main(String[] args) {

//        Discrete distribution

//        int m = Integer.parseInt(args[0]);

//        First Concern
//        How do I get a random amount of integers from the command line?
//        I don't know how many integers will be entered

        System.out.println("Command Line argument Length: " + args.length);
        int m = Integer.parseInt(args[0]);

        int [] arr = new int[args.length-1];
        System.out.println("Length of the Random Command Line Variables: "+arr.length);

        for (int i = 0; i < args.length-1; i++){
            arr[i] = Integer.parseInt(args[i+1]);
            System.out.println(arr[i]);
        }
        System.out.println("Array: " + Arrays.toString(arr));

//        int s_0 = 0;
//        int[] cum_sum_arr = new int [args.length-1];
//
//        for (int i = 1; i < args.length -1; i++){
//            System.out.println(arr[i]);
//            s_0 += arr[i];
//            System.out.println("s_0: " +s_0);
//            System.out.println("Cumulative Array:* " + Arrays.toString(cum_sum_arr));
//
//            cum_sum_arr[i] = s_0;
//        }
//        System.out.println("Cumulative Sum: " +s_0);
//        System.out.println("Cumulative Sum Array: " + Arrays.toString(cum_sum_arr));
//
//        int rand = (int) Math.random() * (s_0-1);
//





    }
}
