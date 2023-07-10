import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String msg = "";
        int reps = 0; // number of times to print the output
        do {
            System.out.print("Enter the msg: ");
            msg = in.nextLine();
            if(msg.length() > 0); {done = true;}
        }
        while (!done);
        for ( int rep = 1; rep <= reps; rep++)
        {sayMessage(msg);}
        System.out.println();
    }
    private static void sayMessage(String msg) {
        System.out.println(msg);
    }
}