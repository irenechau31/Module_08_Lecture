import java.util.Scanner;

// Example 3: Add another parameter and
// save the loop into the method
public class repeatMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String msg = "";
        int reps = 0;
        repeatMessage(msg, reps);
        repeatMessage("Get Bent!", 5);
        repeatMessage("Kowabunga Dude!", 3);
    }
    private static void repeatMessage(String msg, int reps){
        for (int rep = 1; rep <= reps; rep++)
        {
            System.out.println(msg);
        }
    }
}
