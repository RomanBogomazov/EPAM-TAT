class PopularFemaleName {
  private String name = "not presented";
  private int maxCount = 0;
  private int cycleCount = 0;

/**
 * @param persons contain list of persons.
 * @return String value - the most popular female name.
 * If count of the most popular name more than one - @return "not presented".
 */
  public String get(Person[] persons) {
    for(int i = 0; i < persons.length; i++) {
      if(persons[i].sex.equals("female")) {
	for(int j = i + 1; j < persons.length; j++) {
          if(persons[i].name.equals(persons[j].name)) {
            cycleCount++;
          }
        }

        if(maxCount < cycleCount) {
          maxCount = cycleCount;
          name = persons[i].name;
        }
      }
    }
    return name;
  }
}