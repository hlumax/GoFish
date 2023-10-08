package fishtastic.com;

public class Card{
    private String cardID;
    private int suite;
    private int deck; //what is this for?
    private int rank;

    public Card(String cardID, int suite, int rank){
        this.cardID = cardID;
        this.suite = suite;
        this.rank = rank;
    }

    public int getRank(){
        return rank;
    }

    public int getSuite(){
        return suite;
    }

    public void showCard(){
        //not sure of function
        //presumably for user interface?? although may have different purpose as java code will not reflect user interface
    }

    public static String formalRank(int numRank){
        String result = "";

        switch(numRank){
            case 1:
                result = "Ace";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            case 10:
                result = "Ten";
                break;
            case 11:
                result = "Jack";
                break;
            case 12:
                result = "Queen";
                break;
            case 13:
                result = "King";
                break;

        }
        return result;
    }

    public String toString(){
        String result = "";

        switch(rank){
            case 1:
                result = "Ace";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            case 10:
                result = "Ten";
                break;
            case 11:
                result = "Jack";
                break;
            case 12:
                result = "Queen";
                break;
            case 13:
                result = "King";
                break;
            //case default:
            //result = "Error: not in 1-13 range";
            //break;

        }
        result = result + " of " + Suite.getSuite(suite);
        return result;
    }


	/*public Card(String suite, int deck){
		this.suite = suite;
		this.deck = deck;
	}*/

}
