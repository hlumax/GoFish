package fishtastic.com;

import java.util.List;
import java.util.ArrayList;

public class Player{
    private String playerID;
    private String playerName;
    private Hand hand;
    private int numBooks;
    private List<List<Card>> books = new ArrayList<>();

    public Player(String playerID, String playerName){
        this.playerID = playerID;
        this.playerName = playerName;
    }
	/*public Player(String playerID, String playerName, Hand hand){
		this.playerID = playerID;
		this.playerName = playerName;
		this.hand = hand;
	}*/

    public String getPlayerID(){
        return playerID;
    }
    public String getPlayerName(){
        return playerName;
    }

    public int getNumBooks(){
        return numBooks;
    }

    public Hand getHand(){
        return hand;
    }

    public void allocateHand(Hand hand){
        this.hand = hand;
    }

    public Card giveCard(int requestedRank){
        return hand.getCard(requestedRank);
    }

    public void takeCard(Card newCard){
        hand.addCard(newCard);
    }

    public List<List<Card>> getBooks(){
        return books;
    }

    public List<Card> checkForNewBooks(){
        List<Card> newBooks = new ArrayList<>();
        newBooks = hand.getBook();
        if(newBooks!=null){
            books.add(newBooks);
        }
        return newBooks;
    }

    public void displayBooks(){
        if(books != null){
            for(int i = 0; i < books.size(); i++){
                System.out.println("Book " + Card.formalRank(books.get(i).get(0).getRank()));
                for(int j = 0; j <books.get(i).size(); j++){
                    System.out.println(books.get(i).get(j).toString());
                }
                System.out.println();
            }
        }
    }
}