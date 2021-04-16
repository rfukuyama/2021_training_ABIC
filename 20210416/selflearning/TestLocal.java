package selflearning;

public class TestLocal {
	public static void main(String[] args) {
		int y = 30;
		//メソッド呼び出し
		method(y);
		System.out.println("----main()------");
		System.out.println("main()   y: " + y);
	}

	static void method(int y) {
		y *= 10;
		System.out.println("----main()------");
		System.out.println("method() y:" + y);
	}

}
