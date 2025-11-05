// TCP Client
// Name: Gurpreet Kaur

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String message = "Hello from GurpreetKaur";
            out.println(message);
            System.out.println("Sent: " + message);

            String response = in.readLine();
            System.out.println("Server Response: " + response);

            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
