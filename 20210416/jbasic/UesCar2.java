package jbasic;

public class UesCar2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		// 1台目
		c1.maker = "HONDA";
		c1.displacement = 2000;
		c1.color = "青";
		//2台目
		c2.maker = "TOYOTA";
		c2.displacement = 3000;
		c2.color = "赤";
		System.out.println("c1のメーカーは" + c1.maker + "です");
		System.out.println("c1の色は" + c1.color + "です");
		System.out.println("c2のメーカーは" + c2.maker + "です");
		System.out.println("c2の色は" + c2.color + "です");
	}
}