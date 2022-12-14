import java.net.ServerSocket;
import java.net.Socket;

/**
 * marketServer.java
 * This class description is mentioned in the README.md.
 *
 * @author Parth Shah, Pranav Konda, Aarush Sachdeva
 * @version December 10th, 2022
 */
public class MarketServer {
    public static void main(String[] args) throws Exception {
        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(1000);
        Boolean running = true;
        while (running) {
            Socket socket = serverSocket.accept();
            Server server = new Server(socket);
            server.start();
        }
        serverSocket.close();
    }
}
