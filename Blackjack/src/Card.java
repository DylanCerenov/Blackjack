/**
 * @author Dylan and Matt
 * October 24, 2018 
 * Card.java
 * Creating a blackjack game
 */
import java.util.*;

class Card
{
	/**
	 * This creates the cards and specifies the suit of the card
	 */
	static String[] cardName = {"S-Two","S-Three","S-Four","S-Five","S-Six","S-Seven","S-Eight","S-Nine","S-Ten","S-Jack","S-Queen","S-King","S-Ace",
								"H-Two","H-Three","H-Four","H-Five","H-Six","H-Seven","H-Eight","H-Nine","H-Ten","H-Jack","H-Queen","H-King","H-Ace",
								"D-Two","D-Three","D-Four","D-Five","D-Six","D-Seven","D-Eight","D-Nine","D-Ten","D-Jack","D-Queen","D-King","D-Ace",
								"C-Two","C-Three","C-Four","C-Five","C-Six","C-Seven","C-Eight","C-Nine","C-Ten","C-Jack","C-Queen","C-King","C-Ace"};

    public static String GetFace(int num)
    {
        return cardName[num];
    }
}