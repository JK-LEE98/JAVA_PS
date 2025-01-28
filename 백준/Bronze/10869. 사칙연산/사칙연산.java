import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 처리
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 연산 결과 출력
        System.out.println(A + B); // 덧셈
        System.out.println(A - B); // 뺄셈
        System.out.println(A * B); // 곱셈
        System.out.println(A / B); // 정수 나눗셈
        System.out.println(A % B); // 나머지

        scanner.close(); // 스캐너 닫기 (권장)
    }
}
