package headFirst;
import java.net.*;
class FindIP{
    public static void main (String args[]) {
        InetAddress ip;
        
        try {
            ip = InetAddress.getLocalHost();
            System.out.println (ip);
        }catch (Exception e) {}
    }
}