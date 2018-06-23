//This class is the launcher of the 'Sink a DotCom' game discussed in chapter 6
/*
 * How to play?
 * There is a virtual grid of 7x7
 * Cells are named as A4, B7, G1, etc.
 * The dotcoms will be located to any three adjacent cells
 * You have to guess those cells (eq. E5)
 * If you enter the cells where there IS a dotcom, you will 'hit' it
 * otherwise 'miss'
 * As a dotcom takes up 3 cells, you have to guess all of its cells 
   */
package headFirst;
import java.util.*; 
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame() {
        //first make some dot coms and set up their locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("Java.com");
        DotCom three = new DotCom();
        three.setName("Prasoon.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println ("Your goal is to sink three dot coms.");
        System.out.println ("Pets.com, Java.com, Prasoon.com");
        System.out.println ("Try to sink them all in the fewest number of guesses");
        
        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }//close for loop
    }//close setUpGae method
    
    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }//close while
        finishGame();
    }//close startPlaying method
    
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself (userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals ("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }//close for
        System.out.println (result);
    }//close method
    
    private void finishGame() {
        System.out.println ("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println ("It only tool you " +numOfGuesses+" guesses.");
            System.out.println ("You got out before your options sank.");
        } else {
            System.out.println ("Took you long enough, "+numOfGuesses+" guesses.");
            System.out.println ("Fish are dancing with your options.");
        }
    }//close method
    
    public static void main (String args[]) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }//close method
}