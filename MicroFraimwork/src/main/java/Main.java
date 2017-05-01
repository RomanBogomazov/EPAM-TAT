import DAO.IDAO;
import DAO.TextDAO;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    IDAO textDAO = new TextDAO();
    ArrayList<String> list = textDAO.getInstructions();
    Manager manager = new Manager();
    for (String instruction : list) {
      try {
        manager.executeInstruction(instruction);
      } catch (NullPointerException ex) {
      } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Wrong parameters");
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}
