import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int temp1 = arr[0];
        int temp2 = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] > temp1) {
                temp1 = arr[i];
            }
            if (arr[i] < temp2) {
                temp2 = arr[i];
            }
        }

        bw.write(temp2 + " " + temp1);

        bw.flush();
        bw.close();
    }
}