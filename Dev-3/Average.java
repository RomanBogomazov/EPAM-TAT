/**
 * Class to calculate average age of persons.
 */
class Average {
  private int sum = 0;

/**
 * @param persons contain list of persons.
 * @return byte value.
 */
  public byte get(Person[] persons) {
    for(int i = 0; i < persons.length; i++) {
      sum += persons[i].age;
    }
    return (byte)(sum /= persons.length);
  }
}