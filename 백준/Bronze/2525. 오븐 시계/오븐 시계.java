import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        H = H + (N / 60);
        M = M + (N % 60);

        if (M >= 60 && H >= 23) {
            H = H - 24 + 1;
            M = M - 60;
            System.out.println(H + " " + M);
        } else if(M >= 60 && H < 23) {
            H = H + 1;
            M = M - 60;
            System.out.println(H + " " + M);
        } else if(M < 60 && H >= 24) {
            H = H - 24;
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + M);
        }
        scanner.close();
    }
}