package fishtastic.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand{
    private int playerHand; //what is this for
    //private List<Card> cards = {"Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King","Ace", "2","3","4","5","6","7","8","9","10"","Jack","Queen", "King"};

    private List<Card> cards = new ArrayList<>();
    private int numCards;

    //private String playerID;
    //private Player player;
    //private String playerName; //I dont think we need this cause we can pull it from the player object

    private boolean hasCard;

    public Hand(List<Card> cards){
        this.cards = cards;
        numCards = cards.size();
    }

	/*public Hand(Player player){
		this.player = player;
		this.playerID = player.getPlayerID;
		this.playerName = player.getPlayerName;
		//give random or sequentially next int
	}

	public void setHand(List<Card> cards){
		this.cards = cards;
		numCards = cards.size();
	}*/

    public boolean checkForCard(int requestedRank){
        for(int i =0; i<numCards; i++){
            if(cards.get(i).getRank()==requestedRank){
                return true;
            }
        }
        return false;
    }

    public Card getCard(int requestedRank){
        //returns the requested card object, first one that matches rank
        //remove said card for the list of cards
        if(checkForCard(requestedRank)){
            for(int i =0; i<numCards; i++){
                if(cards.get(i).getRank()==requestedRank){
                    Card result = cards.get(i);
                    cards.remove(result);
                    numCards--;
                    return result;
                }
            }
        }
        return null;
    }

    public int checkForBook(){
        int[] frequency = new int[13];
        for(int i = 0; i<13; i++){
            for(int j = 0; j<cards.size(); j++){
                if(cards.get(j).getRank()==i+1){
                    frequency[i]++;
                }
            }
        }

        for(int i =0; i<13; i++){
            if(frequency[i] == 4){
                return i+1;
            }
        }
        return -1;
    }

    public List<Card> getBook(){
        List<Card> result = new ArrayList<>();
        while(checkForBook()!=-1){
            int bookRank = checkForBook();

            for(int i =0; i<4; i++){
                Card current = getCard(bookRank);
                result.add(current);
            }

			/*for(int i =0; i<cards.size(); i++){
				if(cards.get(i).getRank()==bookRank){
					Card current = cards.get(i);
					//result.add(current);
					cards.remove(current);
					numCards--;
				}
			}
			Card heart = new Card(bookRank+"Hearts", Suite.SUITE_HEARTS, bookRank);
			result.add(heart);
			Card diamond = new Card(bookRank+"Diamonds", Suite.SUITE_DIAMONDS, bookRank);
			result.add(diamond);
			Card club = new Card(bookRank+"Clubs", Suite.SUITE_CLUBS, bookRank);
			result.add(club);
			Card spade = new Card(bookRank+"Spades", Suite.SUITE_SPADES, bookRank);
			result.add(spade);
			System.out.println(result.size());*/
            return result;
        }
        return null;
    }


    public void addCard(Card newCard){
        cards.add(newCard);
        numCards++;
    }

    public int identifyCardToRequest(){
        int[] frequency = new int[13];
        for(int i = 0; i<13; i++){
            for(int j =0; j<numCards; j++){
                if(cards.get(j).getRank()==i+1){
                    frequency[i]++;
                }
            }
        }
        int ans = 0;
        int rank = -1;
        for(int i =0; i<13; i++){
            if(frequency[i] > ans){
                ans = frequency[i];
                rank = i+1;
            }
            if(frequency[i]<ans && frequency[i]>0 && rank == -1){
                rank = i+1;
            }
        }
        return rank;

    }

    public void displayHand(){
        for(int i =0; i<numCards; i++){
            System.out.println(cards.get(i).toString());
        }
    }

    public boolean isEmpty(){
        if(cards.size()==0){
            return true;
        }
        return false;
    }
}