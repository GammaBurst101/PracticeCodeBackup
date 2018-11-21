package headFirst;
import java.util.*;
class TestMaps{
    public static void main (String args[]){
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        
        scores.put("Prasoon", 20);
        scores.put("Pushkar", 99);
        scores.put("Chitransh", 102);
        scores.put("Vibhas", 2000);
        
        System.out.println(scores);
        System.out.println(scores.get("Vibhas"));
    }
}