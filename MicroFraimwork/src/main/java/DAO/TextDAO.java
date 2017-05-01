package DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Parse instructions, which receive from file.
 */
public class TextDAO implements IDAO{

  private ArrayList<String> list;

  /**
   * Parse instruction like strings, add to list and return this list.
   *
   * @return List - list, contains instructions in file.
   */
  public ArrayList<String> getInstructions() {
    list = new ArrayList<>();
    try (
      BufferedReader reader = new BufferedReader(new FileReader("commands.txt"))) {
      String cashString;
      while ((cashString=reader.readLine())!=null){
        list.add(cashString);
      }
    } catch (IOException ex) {
      System.err.println("File not found");
    }
    list.add("close");
    return list;
  }
}