public class DiscreteDistribution {

    public static void main(String[] args) {

//        Discrete distribution
//        https://introcs.cs.princeton.edu/java/14array/DiscreteDistribution.java.html


//        To generate a random index i with probability proportional to ai:
//
//        Define the cumulative sums Si=a1+a2+…+ai, with S0=0.
//        Pick a random integer r uniformly between 0 and Sn−1.
//        Find the unique index i between 1 and n such that Si−1≤r<Si.
//                Geometrically, this subdivides the interval [0,Sn) into n subintervals [Si−1,Si), with the length of subinterval i proportional to ai. For example, if the discrete distribution is defined by
//
//        (a1,a2,a3,a4,a5,a6)=(10,10,10,10,10,50),
//        then the cumulative sums are
//                (S1,S2,S3,S4,S5,S6)=(10,20,30,40,50,100)
//        and the following diagram illustrates the 6 subintervals:


//        int m = Integer.parseInt(args[0]);

//        First Concern
//        How do I get a random amount of integers from the command line?
//        I don't know how many integers will be entered

//        System.out.println("Command Line argument Length: " + args.length);


        int m = Integer.parseInt(args[0]);

        int [] arr = new int[args.length-1];
//        System.out.println("Length of the Random Command Line Variables: "+arr.length);

        for (int i = 0; i < args.length-1; i++) {
            arr[i] = Integer.parseInt(args[i+1]);
//            System.out.println(arr[i]);
        }
//        System.out.println("Array: " + Arrays.toString(arr));

        int s0 = 0;
        int[] cum_sum_arr = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            s0 += arr[i];
//            System.out.println("s_0: " +s_0);
//            System.out.println("Cumulative Array:* " + Arrays.toString(cum_sum_arr));
            cum_sum_arr[i] = s0;
        }
//        System.out.println("Cumulative Sum: " +s_0);
//        System.out.println("Cumulative Sum Array: " + Arrays.toString(cum_sum_arr));

//        System.out.println("Last Value in Array: " + (cum_sum_arr[cum_sum_arr.length-1]-1));

//        int num = cum_sum_arr.length - 1;


//        System.out.print(" num: " + (num) );

//        int iteration_check = 0;
        for (int g = 0; g < m; g++) {
            int rand = (int) (Math.random() * (cum_sum_arr[cum_sum_arr.length-1]));
//            int rand = ThreadLocalRandom.current().nextInt(1, cum_sum_arr[cum_sum_arr.length-1]-1);
//            System.out.println(cum_sum_arr[cum_sum_arr.length-1]);

//            System.out.println("r: " + rand);

            if (rand >= 0 && rand < cum_sum_arr[0]) {
                System.out.print(1 +" ");
//                iteration_check++;
            }
            for (int j = 0; j < cum_sum_arr.length; j++) {
                if (rand >= cum_sum_arr[j] && rand < cum_sum_arr[j+1]) {
                    System.out.print(j+2 +" ");
//                    iteration_check++;
                }
            }

        }
//        System.out.print("Iteration Check: "+ iteration_check);

//        while(m != 0){
//          System.out.print(m);
//            m--;
//        }








    }
}
