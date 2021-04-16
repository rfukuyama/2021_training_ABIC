package selflearning;

class Field {
	int y;

	void method() {
		y *= 5;
		System.out.println("----method()----");
		System.out.println("method() y: " + y);
	}
}

class FieldTest {
	public static void main(String[] args) {
		//インスタンス化
		Field obj = new Field();
		//フィールドにアクセス
		obj.y = 10;
		//メソッド呼び出し
		obj.method();
		System.out.println("----main()------");
		System.out.println("  main() y: " + obj.y);
	}
}