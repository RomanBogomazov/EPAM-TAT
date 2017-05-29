import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server.
 * Created by User on 29.05.2017.
 */
public class Server implements Runnable {
  private static ServerSocket server;
  private static Socket connection;
  private static ObjectOutputStream output;
  private static ObjectInputStream input;

  @Override
  public void run() {
    try {
      server = new ServerSocket(5678, 10);
      while (true){
        connection = server.accept();
        output = new ObjectOutputStream(connection.getOutputStream());
        input = new ObjectInputStream(connection.getInputStream());
        output.writeObject("Your answer: " + input.readObject());
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
