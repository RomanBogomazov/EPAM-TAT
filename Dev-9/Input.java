import java.io.*;
import java.util.*;

/**
 * Class to input data from .ini-file, section and key name from console.
 */
class Input {
  private StringBuilder container = new StringBuilder();
  private Scanner scan = new Scanner(System.in);
  private String str;
  private File file;

/**
 * Method return data from choosing file.
 */
  public String getFileData(String name) {
    file = new File(name);

    try {
      BufferedReader stream = new BufferedReader(new FileReader(file.getAbsoluteFile()));
      try {
        while ((str = stream.readLine()) != null) {
          container.append(str);
          container.append("\n");
        }
      } finally {
          stream.close();
      }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }

    return container.toString();
  }

/**
 * Input section name of .ini - file throw console.
 */
  public String getSectionName() {
    return scan.nextLine();
  }

/**
 * Input key name of .ini - file throw console.
 */
  public String getKeyName() {
    return scan.nextLine();
  }
}