package digit;

public class KeyIndexCount {


	public static void main(String[] args) {

		// 写入数组对象
		Person p1 = new Person("Anderson", 2);
		Person p2 = new Person("Brown", 3);
		Person p3 = new Person("Davis", 3);
		Person p4 = new Person("Garcia", 4);
		Person p5 = new Person("Harris", 1);
		Person p6 = new Person("Jackson", 3);
		Person p7 = new Person("Johnson", 4);
		Person p8 = new Person("Jones", 3);
		Person p9 = new Person("Martin", 1);
		Person p10 = new Person("Martinez", 2);
		Person p11 = new Person("Miller", 2);
		Person p12 = new Person("Moore", 1);
		Person p13 = new Person("Robinson", 2);
		Person p14 = new Person("Smith", 4);
		Person p15 = new Person("Taylor", 3);
		Person p16 = new Person("Thomas", 4);
		Person p17 = new Person("Thompson", 4);
		Person p18 = new Person("White", 2);
		Person p19 = new Person("Williams", 3);
		Person p20 = new Person("Wilson", 4);

		//构造带排序数组a
		Person[] a = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20};
		// 键值频率数组
		int R = 5;
		int[] count = new int[R + 1];

		//辅助数组aux
		int N = a.length;
		Person[] aux = new Person[N];

		//统计频率
		for (int i = 0; i < N; i++) {
			count[a[i].key() + 1]++;
		}

	}


}

class Person {
	private String name;
	private int key;

	//构造函数
	public Person(String name, int key) {
		this.name = name;
		this.key = key;
	}

	int key() {
		return key;
	}

	String toNameKey() {
		return name + ":" + key;
	}

}