/**
 * Main class of project.
 */
class MatrixCalculater {

/**
 * Main method of project.
 */
  public static void main(String[] args) {
    Input input = new Input();
    double[][][] mass = input.get();
    Multiplicater multiply = new Multiplicater();
    ElementOfMatrix element = new ElementOfMatrix();
    Output print = new Output();

    print.get(multiply.get(mass));
  }
}