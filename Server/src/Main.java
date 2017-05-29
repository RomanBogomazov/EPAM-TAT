import Model.Calculator;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Class to debug a server desktop application.
 * Created by User on 29.05.2017.
 */
public class Main extends JFrame implements Runnable{
  private static Socket connection;
  private static ObjectOutputStream output;
  private static ObjectInputStream input;
  private Font font = new Font("Times New Roman", Font.BOLD, 32);
  private Calculator calculator;

  public static void main(String[] args){
    new Thread(new Main("Test")).start();
    new Thread(new Server()).start();
  }

  /** Constructor initialize desktop.*/
  Main(String name){
    super(name);
    calculator = new Calculator();

    setLayout(null);
    setSize(900, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);

    final JTextField text = new JTextField("");
    final JButton buttonPlus = new JButton("Summary");
    final JButton buttonMinus = new JButton("Difference");

    text.setBounds(200, 200, 500, 100);
    text.setFont(font);
    add(text);

    buttonPlus.setBounds(200, 300, 250, 100);
    buttonPlus.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buttonPlus){
          calculator.summary(Float.valueOf(text.getText()));
          sendData(calculator.getAnswer());
        }
      }
    });
    buttonPlus.setFont(font);
    add(buttonPlus);

    buttonMinus.setBounds(450, 300, 250, 100);
    buttonMinus.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buttonMinus){
          calculator.difference(Float.valueOf(text.getText()));
          sendData(calculator.getAnswer());
        }
      }
    });
    buttonMinus.setFont(font);
    add(buttonMinus);
  }

  /** rendering of connection server-client. */
  @Override
  public void run() {
    try {
      while (true){
        connection = new Socket(InetAddress.getByName("127.0.0.1"), 5678);
        output = new ObjectOutputStream(connection.getOutputStream());
        input = new ObjectInputStream(connection.getInputStream());
        JOptionPane.showMessageDialog(null, input.readObject());
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  /** function to send data to server. */
  private static void sendData(Object obj){
    try {
      output.flush();
      output.writeObject(obj);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
