/**
 * @author Dylan and Matt
 * October 24, 2018 
 * Player.java
 * Creating a blackjack game
 */
import java.util.*;

class Player 
{
    static int pTotal, k;

    public Player()
    {
        pTotal = 0;
    }

    /**
     * Tells the user the value of the card the drew
     */
    public static void GetCard()
    {
        k = Deck.Draw();
        System.out.println("You draw: \t" + Card.GetFace(k));
        pTotal += Deck.PlayerGetValue(k);
    }
}