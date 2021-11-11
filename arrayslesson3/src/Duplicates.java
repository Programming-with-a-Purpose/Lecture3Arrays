public class Duplicates {

    public static void main(String[] args){

//        Optional Enrichment Exercise
//        Find a duplicate. Given an integer array of length n,
//        with each value between 1 and n, write a code fragment to determine
//        whether there are any duplicate values. You may not use an extra array
//        (but you do not need to preserve the contents of the given array.)

        int[] arr = new int[] {1,4,2,3,5,2};
//        for (int i: arr) {
//            System.out.println("Value of i: " + i);
//            if (i == arr[i])
//                System.out.println("Duplicate in Array: " + arr[i]);
//        }

        for (int j = 0; j <arr.length ; j++) {
            for (int k = j+1; k < arr.length; k++) {
                if (arr[j] == arr[k])
                    System.out.println("DUPLICATE: " + arr[k]);
            }
        }
        
    }
}
