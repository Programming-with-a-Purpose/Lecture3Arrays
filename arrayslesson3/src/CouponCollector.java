public class CouponCollector {

    public static void main(String[] args)
    {
//        Coupon collector problem
//              •M different types of coupons.
//              •Collector acquires random coupons, one at a time, each type equally likely.
//        Q. What is the expected number of coupons needed to acquire a full collection?

//        Coupon collector simulation [approach to problem]
//              • Generate random int values between 0 and M −1.
//              • Count number used to generate
//          • Count number used to generate each value at least once.

//        Key to the implementation
//            • Create a boolean array of length M. (Initially all false by default.)
//            • When r generated, check the rth value in the array.
//            • If true, ignore it (not new).
//            • If false, count it as new distinct value (and set r th entry to true)

//        [laplace fomulae] the number of cards that you need to generate to get all M is about M natural log N plus 0.57721 M, about that.

        int M = Integer.parseInt(args[0]);
        int cards = 0; // number of cards collected
        int distinct = 0; // number of distinct cards

        boolean[] found = new boolean[M];
        while (distinct < M)
        {
            int r = (int) (Math.random() * M);
            cards++;
            if (!found[r])
            {
                distinct++;
                found[r] = true;
            }
        }
        System.out.println(cards);
    }
}
