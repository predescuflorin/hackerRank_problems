import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String steps = scanner.nextLine();
        int level = 0;
        int valleys = 0;
        boolean under = false;

        for (int i=0; i<n; i++) {
            char let = steps.charAt(i);
            if (let == 'U') level++;
            else if (let == 'D') level--;


            if (!under && level < 0) {
                valleys++;
                under = true;
            }
            if (level >= 0) under = false;
        }
        System.out.println(valleys);
    }
}
