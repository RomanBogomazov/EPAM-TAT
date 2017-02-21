import java.util.*;

/** Class to input params: check, criterion chose, needed skill. */

class Input
{

/** Method to input check. */

  public int check() {
    Scanner cmd = new Scanner(System.in);

    System.out.print("Input money count: ");
    return cmd.nextInt();
  }

/** Method to input criterion chose. */

  public byte chose() {
    Scanner cmd = new Scanner(System.in);

    System.out.print("Chose kriterij(1-3): ");
    return cmd.nextByte();
  }

/** Method to input criterion needed skill. */

  public int teamSkill() {
    Scanner cmd = new Scanner(System.in);

    System.out.print("Input production team skill: ");
    return cmd.nextInt();
  }
}