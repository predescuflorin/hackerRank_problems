import java.util.Scanner;

public class breakingRecords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int h = scanner.nextInt();
        int l = h;

        int highRecBroken = 0;
        int lowRecBroken = 0;

        for (int i = 1; i<n; i++) {
            int t = scanner.nextInt();

            if (h< t) {
                h=t;
                highRecBroken ++;
            }

            if (l>t) {
                l=t;
                lowRecBroken++;
            }
        }

        System.out.print(highRecBroken+ " "+lowRecBroken);



    }
}
