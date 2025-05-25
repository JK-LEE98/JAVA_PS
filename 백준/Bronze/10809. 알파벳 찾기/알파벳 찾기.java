import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        for (int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        String str = br.readLine();
        for (int j=0; j<str.length(); j++) {
            char ch = str.charAt(j);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = j;
            }
        }

        for (int val:arr) {
            bw.write(val + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
