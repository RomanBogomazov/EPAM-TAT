/**
 * Class decide task ¹2.
 */

class MinCoastWithFixedSkill {

/**
 * Method return count of staff to decide this task.
 */


  int[] get(int skill) {
    int min = 0;
    int[] team_count = {0, 0, 0, 0};  //massiv, which consist counts of each qualification
    Junior junior = new Junior();
    Middle middle = new Middle();
    Senior senior = new Senior();
    Lead lead = new Lead();

    do{
      do {
        if(lead.production_skill <= skill) {
          team_count[3] += 1;
          min += lead.payment;
          skill -= lead.production_skill;
          break;
        }
        else if(senior.production_skill <= skill) {
          team_count[2] += 1;
          min += senior.payment;
          skill -= senior.production_skill;
          break;
        }
        else if(middle.production_skill <= skill) {
          team_count[1] += 1;
          min += middle.payment;
          skill -= middle.production_skill;
          break;
        }
        else if(junior.production_skill <= skill) {
          team_count[0] += 1;
          min += junior.payment;
          skill -= junior.production_skill;
          break;
        }
        else break;
      } while(true);
        if(skill == 0) break;
    } while(true);

    return team_count;
  }
}