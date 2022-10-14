import java.util.Scanner;

public class birthdayCake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int maxH = 0;
        int noOfMax = 0;
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();

            if (height > maxH) {
                maxH = height;
                noOfMax = 1;
            } else if (height == maxH) noOfMax++;
        }


        System.out.println(noOfMax);
        scanner.close();
    }
}





