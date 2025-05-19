import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] arr = new String[str.length()];
        int index = Integer.parseInt(br.readLine());

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) + "";
        }

        bw.write(arr[index-1]);
        br.close();
        bw.flush();
        bw.close();
    }
}