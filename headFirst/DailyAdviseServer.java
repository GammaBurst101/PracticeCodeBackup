//Practising networking
package headFirst;

import java.io.*;
import java.net.*;

class DailyAdviseServer {
    String[] adviseList = {"Take smaller bites", "Go for the tight jeans. No You do not look fat in those",
        "One word: inappropriate", "Just for today, be honest", "You might want to rethink the haircut"};
    
    public static void main (String args[]) {
        DailyAdviseServer server = new DailyAdviseServer();
        server.go();
    }
    
    private void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            
            while (true) {
                Socket sock = serverSock.accept();
                
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advise = getAdvise();
                writer.println(advise);
                writer.close();
                System.out.println (advise);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private String getAdvise() {
        int random = (int) (Math.random() * adviseList.length);
        return adviseList[random];
    }
}