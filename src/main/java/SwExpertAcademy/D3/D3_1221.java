package SwExpertAcademy.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class D3_1221 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> order = new HashMap<>();

		order.put("ZRO", 0);
		order.put("ONE", 1);
		order.put("TWO", 2);
		order.put("THR", 3);
		order.put("FOR", 4);
		order.put("FIV", 5);
		order.put("SIX", 6);
		order.put("SVN", 7);
		order.put("EGT", 8);
		order.put("NIN", 9);

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String num = st.nextToken();

			String[] arr = br.readLine().split(" ");

			Arrays.sort(arr, (a, b) -> order.get(a) - order.get(b));
			sb.append(num).append("\n");

			for (String str : arr) {
				sb.append(str).append(" ");
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}
}
