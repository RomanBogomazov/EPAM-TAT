/**
 * Class decide task ¹1.
 */

class MaxSkillWithFixedCoast {

/**
 * Method return count of staff to decide this task.
 */

  int[] get(int check) {
    int max = 0;
    int[] team_count = {0, 0, 0, 0};  //massiv, which consist counts of each qualification
    Junior junior = new Junior();
    Middle middle = new Middle();
    Senior senior = new Senior();
    Lead lead = new Lead();

    do{
      do {
        if(lead.payment <= check) {
          max += lead.production_skill;
          check -= lead.payment;
          team_count[3] += 1;
          break;
        }
        else if(senior.payment <= check) {
          max += senior.production_skill;
          check -= senior.payment;
          team_count[2] += 1;
          break;
        }
        else if(middle.payment <= check) {
          max += middle.production_skill;
          check -= middle.payment;
          team_count[1] += 1;
          break;
        }
        else if(junior.payment <= check) {
          max += junior.production_skill;
          check -= junior.payment;
          team_count[0] += 1;
          break;
        }
        else break;
      } while(true);
        if(check == 0) break;
        if(check < junior.payment) {
          System.out.println("You can safe this coast " + check + ", or you can bargain for one Junior. ");
          break; }
    } while(true);

    return team_count;
  }
}