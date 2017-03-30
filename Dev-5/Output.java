/**
 * Class to output information in task.
 */

class Output {

/**
 * Method to output count staff of each qualification.
 */

  public void get(int[] team_count) {
    System.out.println();
    System.out.println("Count of lead: " + team_count[3]);
    System.out.println("Count of senior: " + team_count[2]);
    System.out.println("Count of middle: " + team_count[1]);
    System.out.println("Count of junior: " + team_count[0]);
  }
}