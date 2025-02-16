import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) { // i는 1부터 N까지 증가 (줄 수)
            for (int j = 1; j <= N - i; j++) { // 왼쪽 공백 출력
                bw.write(" ");
            }
            for (int j = 1; j <= i; j++) { // 별 출력
                bw.write("*");
            }
            bw.newLine(); // 개행
        }

        bw.flush();
        bw.close();
    }
}