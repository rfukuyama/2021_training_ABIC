package selflearning;

class Capsule {
	private int y;

	void setY(int x) {
		y = x;
	}

	int getY() {
		return y;
	}

	void method() {
		y *= 5;
		System.out.println("----method()----");
		System.out.println("method() y: " + y);
	}
}

class CapsuleTest {
	public static void main(String[] args) {
		//インスタンス化
		Capsule obj = new Capsule();
		//フィールドにアクセス
		obj.setY(10);
		//メソッド呼び出し
		obj.method();
		System.out.println("----main()------");
		System.out.println("  main() y: " + obj.getY());
	}
}