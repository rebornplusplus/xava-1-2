
import java.util.Random;

public class DeckOfCard {
    private Card[] deck;
    private int currentCard;
    private Random randomnumber = new Random();
    
    public DeckOfCard()
    {
        deck =  new Card[52];
        String[] values = { "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        currentCard=0;
        
        for(int i = 0; i<deck.length;i++)
        {
            deck[i] = new Card(values[i%13],suits[i/13]);
        }
    }
    public void shuffle()
    {
        for(int i=0;i<deck.length;i++)
        {
            int j = randomnumber.nextInt(52);
            Card temp = deck[i];
            deck[i]=deck[j];
            deck[j]=temp;
        }
    }
    
    public Card dealCard()
    {
        return deck[currentCard++];
    }
}
