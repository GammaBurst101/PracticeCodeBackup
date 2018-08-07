//Reading from a file
package headFirst;
import java.io.*;
class TestIO2 {
    public static void main (String args[]) {
        try {
            File file = new File("foo.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(reader);
            
            String line = null;
            while ((line = bReader.readLine()) != null) {
                System.out.println (line);
            }
        }catch (IOException err) {
            System.out.println (err);
        }
    }
}