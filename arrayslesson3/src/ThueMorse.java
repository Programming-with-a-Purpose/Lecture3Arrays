public class ThueMorse {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                Have not done anything with the second for loop as yet, but it does what it i to do for the first row.
//                +  -  -  +  -  +  +  -
//                The above is the output if we take out the second for loop.
                char one = '1';
                int radix = 2;
                int[] arr = new int[n];
//            We want to convert the i to binary and then check if the # of 1's in the assortment is even or odd,
//            if even we print a +
//            if odd we print -
                String amtBin = Integer.toString(i, radix);
                int result = countChar(amtBin, one);

                if (result % 2 == 0) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
        }
    }


    private static int countChar(String str, char c){
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }

        return count;
    }
}
