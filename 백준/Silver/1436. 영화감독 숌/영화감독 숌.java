import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();                                         // N값 입력

        int Num = 666;
        int count = 1;                                      // count는 문제에서 말한 번째를 의미함 첫 번째는 666

        while (count != N)  {
            Num++;

            if (String.valueOf(Num).contains("666")) {
            count++;
            }
        }

        System.out.println(Num);

    }
}
