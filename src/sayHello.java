import java.util.Scanner;
public class sayHello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        int reps = 0; // number of hellos to print
        //input reps
        do {
            System.out.println("How many hellos would you like? ");
            if (in.hasNextInt()) {
                reps = in.nextInt();
                in.nextLine();
                done = true;
            }
            else {
                System.out.println("Enter a valid interger, not: " + trash);
            }
        } while (!done);
        //now call/invoke the method #1 in the loop
        for (int rep = 1; rep <= reps; rep++)
        {sayHello();}
        System.out.println();
    }
    private static void sayHello() {
        System.out.println();
    }
}
