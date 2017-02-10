/**
 * Main Class of programm
 */
public class Main {
    
    /**
     * Main Method for output 3 option from any option from command line
     * @param args - string array of option
     * return 3 option
     *
    public static void main(String[] args) {

        private int LengthOfArgs=args.length;
        args.length--;

        for(int i=0; i<3, i++) {
            int randCount = (int) (Math.random() * args.length);
            Sustem.out.println(args[randCount]);
        }
    }
}
    
        