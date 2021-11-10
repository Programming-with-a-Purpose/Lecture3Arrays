import java.io.PrintWriter;

public class Deck {

    public static void main(String[] args)
    {
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suit = { "♣", "♦", "♥", "♠" };
        char[] suit1 = {'\u2660', '\u2665', '\u2663', '\u2666'};

//      https://unicode-table.com/en/2660/
//        Uni Code is used to get the symbols for the suit. See the link above.


        String[] deck = new String[52];
        for (int j = 0; j < 4; j++)
            for (int i = 0; i < 13; i++)
                deck[i + 13*j] = rank[i] + suit[j];
        for (int i = 0; i < 52; i++)
            System.out.print(deck[i] + " ");

        System.out.println();
        System.out.println();

        String[] deck2 = new String[52];
        for (int i = 0; i < 13; i++)
            for (int j = 0; j < 4; j++)
                deck2[i + 13*j] = rank[i] + suit[j];
        for (int i = 0; i < 52; i++)
            System.out.print(deck2[i] + " ");

        System.out.println();
        System.out.println();

        String[] deck3 = new String[52];
        for (int i = 0; i < 13; i++)
            for (int j = 0; j < 4; j++)
                deck3[4*i + j] = rank[i] + suit[j];
        for (int i = 0; i < 52; i++)
            System.out.print(deck3[i] + " ");

//        Problem: Print a random sequence of N cards.
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++){
            int r = (int) (Math.random() * 52);
            System.out.println(deck[r]);
        }

    }

}
