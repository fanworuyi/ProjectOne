package digit;
import java.util.Arrays;

public class StringTest1 {
	public static void main(String[] args) {
		int[] aux = new int[10];
		int m =0;
		for(int i =0; i<10; i++) {
			aux[m++] = i;
			System.out.println(m);
			System.out.println(Arrays.toString(aux));
		}
		// 注意尽量避免使用n = n++; 语句
		int n = 0;
		n = n++;
		n = n++;
		System.out.println("n=" + n); // 输出 n=0
	}
}
