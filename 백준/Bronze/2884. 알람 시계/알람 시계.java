import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();  // 0 <= H <= 23
        int M = scanner.nextInt();  // 0 <= M <= 59

        if (H == 0 && M < 45) {
            H = 23;
            System.out.println(H + " " + (15 +M));
        } else if (0 <= H && H <= 23 && M < 45) {
            System.out.println((H - 1) + " " + (15 + M));
        } else if (0 <= H && H <= 23 && M >= 45) {
            System.out.println(H + " " + (M - 45));
        }
        scanner.close();
    }
}