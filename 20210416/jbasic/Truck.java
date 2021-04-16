package jbasic;

public class Truck extends Car {
	//フィールド
	private String baggage;

	public Truck() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Truck(String maker, int displacement, String color, String baggage) {
		//親のコンストラクタ
		super(maker, displacement, color);
		// TODO 自動生成されたコンストラクター・スタブ
		this.baggage = baggage;
	}

}
