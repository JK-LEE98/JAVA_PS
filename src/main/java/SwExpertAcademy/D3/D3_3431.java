package SwExpertAcademy.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3_3431 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			int answer = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L =Integer.parseInt(st.nextToken());
			int U =Integer.parseInt(st.nextToken());
			int X =Integer.parseInt(st.nextToken());

			if (X > U) {
				answer = -1;
			} else if (X < L) {
				answer = L-X;
			} else {
				answer = 0;
			}
			System.out.println("#" + (tc+1) + " " + answer);
		}
	}
}
