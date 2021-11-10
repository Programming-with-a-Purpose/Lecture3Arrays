public class PQ1array {

        public static void main(String[] args)
        {
            int[] a = new int[6];
            int[] b = new int[a.length];
            b = a;
//            After this, b and a refer to the same array
//            The code b = a does not copy an array (it makes b and a refer to the same array).
            
            for (int i = 1; i < b.length; i++)
                b[i] = i;
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            for (int i = 0; i < b.length; i++)
                System.out.print(b[i] + " ");
            System.out.println();
        }
}
