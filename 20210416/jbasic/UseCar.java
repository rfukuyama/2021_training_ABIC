package jbasic;

public class UseCar {
	public static void main(String[] args) {

		Car c1 = new Car(); // オブジェクトの生成
		Car c2 = new Car();
		Car c3 = new Car("SHIMIZU", 10000, "金");
		// Truckのオブジェクトを生成
		Truck t1 = new Truck("ISUZU", 5000, "白", "冷蔵庫");

		// フィールドの初期化
		// c1.maker = "HONDA";
		c1.setMaker("HONDA");
		c1.setDisplacement(2000);
		c1.setColor("青");
		c2.setMaker("TOYOTA");
		c2.setDisplacement(3000);
		c2.setColor("赤");

		// メソッドの呼び出し
		c1.start();
		c1.curve();
		c1.stop();

		System.out.println("c1のメーカーは" + c1.getMaker() + "です");
		System.out.println("c1の色は" + c1.getColor() + "です");
		System.out.println("c2のメーカーは" + c2.getMaker() + "です");
		System.out.println("c2の色は" + c2.getColor() + "です");

	}
}
