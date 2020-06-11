/**
 * @author Dylan and Matt
 * October 24, 2018 
 * Deck.java
 * Creating a blackjack game
 */
import java.util.*;

class Deck
{
    static Random random = new Random();
    static int[] deck; // cards to deck index = 0,2 1,3 2,4 3,5 4,6 5,7 6,8 7,9 8,10 9,J 10,Q 11,K 12,A
    //static String[] cardName = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
    static int i;

    /**
     * A new deck of cards is created
     */
    public Deck()
    {
        deck = new int[52]; //0-51
    }
  
    /**
     * Shuffles the deck of cards so they game is not repetitive
     */
    public static void Shuffle ()
    {
        //reset deck and scores
        for (int x = 0; x < deck.length; x++)
            deck[x] = 1;
    }
    /**
     * Draws a random card for the dealer or player
     * @return value of a card
     */

    public static int Draw ()
    {
        i = random.nextInt(52); //0-51
        while (deck[i] == 0) //Redraws card if none are available of that type
            i = random.nextInt(52); //generates 0-51
        deck[i] = deck[i] - 1; //Subtracts 1 to show one card was used.
        return i;
    }

    //FOR PLAYER: Finds value of card and returns it
    /**
     * Returns the value of the players total
     * @param num = the total the user has
     * @return the new total
     */
    public static int PlayerGetValue(int num)
    {
        if (num == 12 || num == 25 || num == 38 || num == 51)
        {
            if (Player.pTotal + 11 > 21) //Changes the value of ace depending on the situation
                return 1;
            else
                return 11;
            
        }
        else if ((num > 7 && num < 12) || (num > 20 && num < 25) || (num > 33 && num < 38) || (num > 46 && num < 51))
            return 10;
        else if (num == 0 || num == 13 || num == 26 || num == 39)
            return 2;
        else if (num == 1 || num == 14 || num == 27 || num == 40)
            return 3;
        else if (num == 2 || num == 15 || num == 28 || num == 41)
            return 4;
        else if (num == 3 || num == 16 || num == 29 || num == 42)
            return 5;
        else if (num == 4 || num == 17 || num == 30 || num == 43)
            return 6;
        else if (num == 5 || num == 18 || num == 31 || num == 44)
            return 7;
        else if (num == 6 || num == 19 || num == 32 || num == 45)
            return 8;
        return 9;
    }

    //FOR DEALER: Finds value of card and returns it
    /**
     * Returns the value of the dealers total
     * @param num dealers current total
     * @return the new total
     */
    public static int DealerGetValue(int num)
    {
        if (num == 12 || num == 25 || num == 38 || num == 51)
        {
            if (Dealer.dTotal + 11 > 21) //Changes the value of ace depending on the situation
                return 1;
            else
                return 11;
            
        }
        else if ((num > 7 && num < 12) || (num > 20 && num < 25) || (num > 33 && num < 38) || (num > 46 && num < 51))
            return 10;
        else if (num == 0 || num == 13 || num == 26 || num == 39)
            return 2;
        else if (num == 1 || num == 14 || num == 27 || num == 40)
            return 3;
        else if (num == 2 || num == 15 || num == 28 || num == 41)
            return 4;
        else if (num == 3 || num == 16 || num == 29 || num == 42)
            return 5;
        else if (num == 4 || num == 17 || num == 30 || num == 43)
            return 6;
        else if (num == 5 || num == 18 || num == 31 || num == 44)
            return 7;
        else if (num == 6 || num == 19 || num == 32 || num == 45)
            return 8;
        return 9;
    }
}