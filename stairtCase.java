import java.util.Scanner;

public class stairtCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i<n; i++) {
            for (int j = 1; j<=n; j++) {
                System.out.print(j<n-i? " " : "#");
            }
            System.out.println("");

        }    }
}
