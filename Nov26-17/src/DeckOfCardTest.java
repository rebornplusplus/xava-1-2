
public class DeckOfCardTest {

    public static void main(String[] args) {
        
        DeckOfCard myDeck =  new DeckOfCard();
        myDeck.shuffle();
        
        for(int i=0;i<52;i++)
        {
            System.out.printf("%-20s ", myDeck.dealCard());
            if(i%4==3) System.out.println("");
        }
        // TODO code application logic here
    }
}
