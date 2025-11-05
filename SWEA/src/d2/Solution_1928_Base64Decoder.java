package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1928_Base64Decoder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		StringBuilder sb2;

		char[] base64Table = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', '+', '/' };

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			String text = br.readLine();
			sb = new StringBuilder();
			sb2 = new StringBuilder();

			for (int i = 0; i < text.length(); i++) {
				int base64Value = 0;

				for (int base64Index = 0; base64Index < base64Table.length; base64Index++) {
					if (text.charAt(i) == base64Table[base64Index]) {
						base64Value = base64Index;
						break;
					}
				}

				String sixBitValue = String.format("%6s", Integer.toBinaryString(base64Value)).replace(' ', '0');
				sb.append(sixBitValue);
			}

			for (int i = 0; i < sb.length(); i += 8) {
				char ascii = (char) (Integer.parseInt(sb.substring(i, i + 8), 2));
				sb2.append(String.valueOf(ascii));
			}

			result[test_case] = sb2.toString();
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}