/**
 * Class to calculate maximal age of persons.
 */
class MaxAge {
  private byte max = 0;

/**
 * @param persons contain list of persons.
 * @return byte value.
 */
  public byte get(Person[] persons) {
    for(int i = 0; i < persons.length; i++) {
      if(max < persons[i].age) {
        max = persons[i].age;
      }
    }
    return max;
  }
}