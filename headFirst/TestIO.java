//Writing to a file
package headFirst;
import java.io.*;
class TestIO {
    public static void main (String args[]) {
        try {
            FileWriter writer = new FileWriter("foo.txt");
            writer.write("Hello, foo!");
            writer.write("Welcome to the foo-lish world of foo!");
            writer.close();
        }catch (IOException error) {
            error.printStackTrace();
        }
    }
}