import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(6666)) {
            System.out.println("Server started. Waiting for client...");
            Socket s = ss.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String msg = in.readLine();
            System.out.println("Received: " + msg);

            out.println(msg.toUpperCase());
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
