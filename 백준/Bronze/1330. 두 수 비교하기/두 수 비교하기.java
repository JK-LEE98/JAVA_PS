import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        String str = (a > b) ? ">" : ((a < b) ? "<" : "==");
        System.out.println(str);      
    }
}