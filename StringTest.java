package digit;

import java.util.Arrays;
import java.util.Random;
import java.lang.StringBuilder;

public class StringTest {
	private static String randomStr() {
		int length = 5;
		String strAll = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int charIndicator = new Random().nextInt(62);
			strBuilder.append(strAll.charAt(charIndicator));
		}
		return strBuilder.toString();

	}

	public static void main(String[] args) {
		long startTime=System.nanoTime();   //获取开始时间

		int length1 = 8;
		String[] strArray = new String[length1];

		for (int j = 0; j < length1; j++) {
			strArray[j] = randomStr();
//			System.out.println(strArray[j]);
		}
//随机String数列
		System.out.println(Arrays.toString(strArray));

// 自带排序算法Arrays.sort()
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));

		long endTime=System.nanoTime(); //获取结束时间
		System.out.println("总程序运行时间： "+(endTime-startTime)/1000+" μs");
	}

}
