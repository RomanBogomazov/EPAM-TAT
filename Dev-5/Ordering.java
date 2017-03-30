/**
 * Main class, where user chose task.
 */

class Ordering {

/**
 * Main method.
 */

  public static void main(String[] args) {
    Input input = new Input();
    Output output = new Output();
    MaxSkillWithFixedCoast max = new MaxSkillWithFixedCoast();
    MinCoastWithFixedSkill min_coast = new MinCoastWithFixedSkill();
    MinCountBetterThanJunior min_count = new MinCountBetterThanJunior();

    System.out.println("You can one of 3: ");
    System.out.println("1. The maximum efficiency within the sum. ");
    System.out.println("2. The minimum cost at the fixed efficiency. ");
    System.out.println("3. The minimum number of employees of qualification is higher than Junior for the fixed productivity. ");

    switch (input.chose()) {
      case 1:
        output.get(max.get(input.check()));
        break;
      case 2:
        output.get(min_coast.get(input.teamSkill()));
        break;
      case 3:
        output.get(min_count.get(input.teamSkill()));
        break;
    }
  }
}