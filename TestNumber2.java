package digit;

public class TestNumber2 {
	public static void main(String[] args) {
		int i = 5;

		//方法1
		String str = String.valueOf(i);

		//方法2
		Integer it = i;
		String str2 = it.toString();
		System.out.println(str == str2);

	}

}
