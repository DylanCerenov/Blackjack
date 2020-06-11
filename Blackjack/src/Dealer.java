/**
 * @author Dylan and Matt
 * October 24, 2018 
 * Dealer.java
 * Creating a blackjack game
 */
import java.util.*;

class Dealer 
{
    static int dTotal, m, secondCard;
    static boolean hasAnAce = false;

    public Dealer ()
    {
        dTotal = 0;
    }

    /**
     * The dealer deals out cards for himself
     */
    public static void Deal()
    {
        m = Deck.Draw();
        System.out.println("Dealer draws: \t" + Card.GetFace(m));
        dTotal += Deck.DealerGetValue(m);
        if ((m == 12) || (m == 25) || (m == 38) || (m == 51))
            hasAnAce = true;
    }

    public static void DealSecond()
    {
        secondCard = Deck.Draw();
        dTotal += Deck.DealerGetValue(secondCard);
        if ((secondCard == 12) || (secondCard == 25) || (secondCard == 38) || (secondCard == 51))
            hasAnAce = true;
    }
}