/**
 * @author Dylan and Matt
 * October 30, 2018 
 * Blackjack.java
 * Creating a blackjack game
 */
import java.util.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Card card = new Card();
        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();

        String playAgain = "y", hit = ".";

        /**
         * This is where the game takes place. "While" loop allows game to be played multiple times.
         */
        while (playAgain.equals("y"))
        {
            deck.Shuffle();
            Player.pTotal = 0;
            Dealer.dTotal = 0;

            System.out.println("=====================");
            System.out.println("| B L A C K J A C K |");
            System.out.println("=====================");

            /**
             * This is where the beginning four cards are drawn and dealt.
             */
            player.GetCard(); //Player draws first card.
            player.GetCard(); //Player draws second card.
            dealer.Deal(); //Dealer draws first card.
            System.out.println("The dealer's total is atleast " + Dealer.dTotal + ".");
            dealer.DealSecond(); //Dealer draws second card.
            
            if (Player.pTotal < 21)
            {
                System.out.println("Your total is " + Player.pTotal + ". Do you wish to hit? (y/n)");   
                hit = scan.nextLine();
                while (!(hit.equals("y")) && !(hit.equals("n")))
                {
                    System.out.println("You have to enter \"y\" or \"n\"");
                    hit = scan.next();
                }
            }
            
            /**
             * Allows the player to hit. 
             */
            if (hit.equals("y"))
            {
                while (hit.equals("y"))
                {
                    player.GetCard();

                    if (Player.pTotal >= 21)
                        hit = "n";
                    else
                    {
                        System.out.println("Your total is " + Player.pTotal + ". Do you wish to hit? (y/n)");
                        hit = scan.nextLine();
                        while (!(hit.equals("y")) && !(hit.equals("n")))
                        {
                            System.out.println("You have to enter \"y\" or \"n\"");
                            hit = scan.nextLine();
                        }
                    }
                }   
            }

            if (Player.pTotal <= 21)
                System.out.println("Dealer reveals: " + card.GetFace(Dealer.secondCard));

            /**
             * Allows the game to continue as long as the player and dealer have not gone over the score limit
             */
            while (Dealer.dTotal < 17 && Player.pTotal <= 21 && (Player.pTotal >= Dealer.dTotal)) // draws more cards for dealer   
                dealer.Deal(); // ACE + 3 + 3

            //if (Dealer.dTotal == 17 && Dealer.hasAnAce) // If dealer drew an Ace and a six
            //{
            //    System.out.println("Soft 17!");
            //    dealer.Deal();
            //} 

            System.out.println("Player total: " + Player.pTotal);

            if (Player.pTotal <= 21)
                System.out.println("Dealer total: " + Dealer.dTotal);

            if (Player.pTotal > 21)
                System.out.println("\nYou went over 21. DEALER WINS.");
            else if (Dealer.dTotal > 21)
                System.out.println("\nDealer went over 21. YOU WIN.");
            else if ((21 - Player.pTotal) > (21 - Dealer.dTotal))
                System.out.println("\nDealer was closer to 21. DEALER WINS.");
            else if ((21 - Player.pTotal) < (21 - Dealer.dTotal))
                System.out.println("\nYou were closer to 21. YOU WIN.");
            else 
                System.out.println("\nYou and dealer were equally close to 21. GAME TIES.");
            
            System.out.println("Do you want to play again? (y/n)");
            playAgain = scan.nextLine();
            
            /**
             * Allows the user to play multiple games
             */
            while (!(playAgain.equals("y")) && !(playAgain.equals("n")))
            {
                System.out.println("You have to enter \"y\" or \"n\"");
                playAgain = scan.nextLine();
            }
            
            System.out.println("\n");
        }
        System.out.println("Thank you for playing.");
    }
}