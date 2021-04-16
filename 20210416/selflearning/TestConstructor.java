package selflearning;

class Const {
	//メンバ変数
	double x;
	int y;

	//コンストラクタ
	Const(double x, int y) {
		this.x = x;
		this.y = y;
	}

	//コンストラクタのオーバーロード
	Const(double x) {
		this.x = x;
		this.y = 15;
	}

	//コンストラクタのオーバーロード
	Const() {
		this.x = 10;
		this.y = 15;
	}

	//メソッド
	double getMean() {
		double z = this.x / this.y;
		return z;
	}
}

class TestConstructor {
	public static void main(String args[]) {
		double m1, m2;
		//インスタンス変数宣言
		Const obj1;
		Const obj2;
		//コンストラクタ呼び出し（インスタンス化）
		obj1 = new Const(1059.0, 12);
		obj2 = new Const(1298.0);
		//メソッド呼び出し
		m1 = obj1.getMean();
		m2 = obj2.getMean();
		System.out.println("obj1: " + m1);
		System.out.println("obj2: " + m2);
	}
}