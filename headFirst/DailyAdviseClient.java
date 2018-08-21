//Practising networking
/*
 * NOTE: Either the server or the client has to be run
 *       on a different project.
   */
package headFirst;

import java.io.*;
import java.net.*;

class DailyAdviseClient {
    public static void main (String args[]) {
        DailyAdviseClient client = new DailyAdviseClient();
        client.go();
    }
    
    private void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            
            String advise = reader.readLine();
            System.out.println ("Today you should: "+advise);
            
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}