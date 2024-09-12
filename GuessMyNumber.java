import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int guess = 50;
        int modifier = 25;
        // loop:
        // modifier / 2 (50->25->12->6->3->1->0)
        // add +1 to modifier every time (so it's not zero)
        // is 50? yes/no, if yes break
        // if no, higher or lower?
        // if higher, add modifier to existing guess (e.g, 50->+25->75)
        // if lower, subtract modifier from guess
        while(true) {
            // make the guess
            System.out.println("Is your number " + guess + "? (yes/no)");
            String response = in.nextLine();
            if(response.equals("yes")) {
                System.out.println("Tada!");
                break;
            } else {
                System.out.println("(higher/lower)?");
                response = in.nextLine();
                if(response.equals("higher")) {
                    guess += modifier;
                } else {
                    guess -= modifier;
                }
                modifier /= 2;
                if(modifier == 0) {
                    modifier = 1;
                }
            }
        }
    }
}
