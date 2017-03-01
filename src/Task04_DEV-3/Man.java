package task04_dev.pkg3;

/**
 *
 * @author 0mainPC
 */
public class Man {
  private String name;
  private String surname;
  private char gender;
  private byte age;

  /**
   * Method for add information about new man
   * @param string name, string surname, char gender and byte age
   */
  public Man(String name, String surname, char gender, byte age) {
    this.surname = surname;
    this.name = name;
    this.gender = gender;
    this.age = age;
  }
  
  /**
   * Method for output information about name
   * @rerurn name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Method for output information about surname
   * @rerurn surname
   */
  public String getSurname() {
    return surname;
  }
  
  /**
   * Method for output information about gender
   * @rerurn gender
   */
  public char getGender() {
    return gender;
  }
 
  /**
   * Method for output information about age
   * @rerurn age
   */
  public byte getAge() {
    return age;
  }
}
