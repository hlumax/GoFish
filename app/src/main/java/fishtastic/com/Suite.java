package fishtastic.com;

public class Suite{
    public static final int SUITE_HEARTS = 1;
    public static final int SUITE_DIAMONDS = 2;
    public static final int SUITE_CLUBS = 3;
    public static final int SUITE_SPADES = 4;

    public static String getSuite(int num){
        String ans = "";
        switch(num){
            case Suite.SUITE_HEARTS:
                ans = "Hearts";
                break;
            case Suite.SUITE_DIAMONDS:
                ans = "Diamonds";
                break;
            case Suite.SUITE_CLUBS:
                ans = "Clubs";
                break;
            case Suite.SUITE_SPADES:
                ans = "Spades";
                break;
        }
        return ans;
    }
}
