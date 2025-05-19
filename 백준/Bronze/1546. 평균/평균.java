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

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int m = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > m) m = arr[i];
        }

        for (int k = 0; k < arr.length; k++) {
            double newScore = (double) arr[k] / m * 100;
            sum += newScore;
        }

        double avg = sum / N;
        bw.write(avg + " ");

        br.close();
        bw.flush();
        bw.close();
    }
}