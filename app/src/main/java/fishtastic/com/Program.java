package fishtastic.com;

import java.util.Scanner;
import java.util.Random;

public class Program{

    public static void startNewGame(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        Random rnd = new Random();
        String userID = name.charAt(0) + "user" + rnd.nextInt(87);
        Player user = new Player(userID, name);
        Player comp = new Player("comp" + rnd.nextInt(345), "Computer");
        GoFish newGame = new GoFish(user, comp);
        newGame.runGameLoop();
    }

    public static void main(String[] args){
        System.out.println("Welcome to Go Fish");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"S\" to start a new game");

        String option = sc.next();

        if(option.equalsIgnoreCase("S")){
            startNewGame();
        }

    /*if (GoFish.end()==true){
      System.exit(0);
    }else{
    }*/

    }

}