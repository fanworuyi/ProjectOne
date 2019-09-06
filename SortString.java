package digit;

import java.util.Random;

public class SortString {
	private static String StringMaker() {
		int length = 5;
		String strAll = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int charIndicator = new Random().nextInt(52);
			strBuilder.append(strAll.charAt(charIndicator));
		}
		return strBuilder.toString();
	}


	private static int charAt(String s, int d) {
		if (s.charAt(d) <= 91)
			return s.charAt(d) - 65;
		else
			return s.charAt(d) - 97;
	}

	public static void main(String[] args) {

		int N = 8;
		System.out.println("Before sorting, strings are:");
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = StringMaker();
			System.out.println(s[i]);
		}

		int R = 26;
		int[] count = new int[R + 1];
		String[] aux = new String[N];
		for (int i = 0; i < N; i++) {
			count[charAt(s[i], 0) + 1]++;
		}

		for (int r = 0; r < R; r++) {
			count[r + 1] += count[r];
		}

		for (int i = 0; i < N; i++) {
			aux[count[charAt(s[i], 0)]++] = s[i];
		}

		for (int i = 0; i < N; i++) {
			s[i] = aux[i];
		}

		System.out.println("\n************************************");
		System.out.println("After sorting, strings are:");
		for (int i = 0; i < N; i++) {
			System.out.println(s[i]);
		}

	}


}