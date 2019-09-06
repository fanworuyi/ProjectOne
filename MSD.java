package digit;

public class MSD {
	private static int R = 26;
	private static String[] aux;

	public static int charAt(String s, int d) {
		if (d < s.length())
			return s.charAt(d) - 97;
		else
			return -1;
	}

	private static void sort(String[] a) {
		int N = a.length;
		aux = new String[N];
		sort(a, 0, N - 1, 0);
	}

	private static void sort(String[] a, int lo, int hi, int d) {
		// Sort from a[lo] to a[hi], starting at the dth character.

		int[] count = new int[R + 2]; // Compute frequency counts.
		for (int i = lo; i <= hi; i++)
			count[charAt(a[i], d) + 2]++;
		for (int r = 0; r < R + 1; r++) // Transform counts to indices.
			count[r + 1] += count[r];
		for (int i = lo; i <= hi; i++) // Distribute.
			aux[count[charAt(a[i], d) + 1]++] = a[i];
		for (int i = lo; i <= hi; i++) // Copy back.
			a[i] = aux[i - lo];


// Recursively sort for each character value.
//		for (int r = 0; r < R; r++) {
//			System.out.println(count[r]);
//		}
//		System.out.println("this is: " + lo);
//		System.out.println(d+1);
		if (lo < hi) {
			for (int r = 0; r < R; r++) {

				sort(a, lo + count[r], lo + count[r + 1] - 1, d + 1);
			}
		}
//
	}

	public static void main(String[] args) {
		String[] a = new String[]{"she", "sells", "seashells", "b", "by", "the", "sea", "shore", "the", "a", "shells", "she", "sells", "are", "surely", "seashells"};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
