import java.util.*;

/**
 * Class decide task ¹3.
 */

class MinCountBetterThanJunior {

/**
 * Method return count of staff to decide this task.
 */

  int[] get(int skill) {
    int count = 0;
    int[] team_count = {0, 0, 0, 0};  //massiv, which consist counts of each qualification
    Junior junior = new Junior();
    Middle middle = new Middle();
    Senior senior = new Senior();
    Lead lead = new Lead();

    do{
      do {
        if(lead.production_skill <= skill) {
          count ++;
          team_count[3] += 1;
          skill -= lead.production_skill;
          break;
        }
        else if(senior.production_skill <= skill) {
          count ++;
          team_count[2] += 1;
          skill -= senior.production_skill;
          break;
        }
        else if(middle.production_skill <= skill) {
          count ++;
          team_count[1] += 1;
          skill -= middle.production_skill;
          break;
        }
        else break;
      } while(true);
        if(skill == 0) break;
        else if(skill == 1) {
          System.out.println("You have chance to give one Junior.");
          break;}
    } while(true);

    return team_count;
  }
}