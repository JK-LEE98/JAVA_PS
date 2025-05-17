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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        int M = Integer.parseInt(st.nextToken());
        int temp;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;

            while (I < J) {
                temp = arr[I];
                arr[I] = arr[J];
                arr[J] = temp;
                I++;
                J--;
            }
        }
        br.close();
        for (int k = 0; k < N; k++) {
            bw.write(arr[k] + " ");
        }
        bw.flush();
        bw.close();
    }
}