package jbasic;

public class Car {
	// フィールド
	private String maker;
	private int displacement;
	private String color;

	// コンストラクタ
	public Car() {
	}

	public Car(String maker, int displacement, String color) {
		this.maker = maker;
		this.displacement = displacement;
		this.color = color;
	}

	// makerのゲッター
	public String getMaker() {
		return maker;
	}

	// makerのセッター
	public void setMaker(String maker) {
		this.maker = maker;
	}

	// メソッド
	public void start() {
		System.out.println("発進します");
	}

	public void stop() {
		System.out.println("止まります");
	}

	public void curve() {
		System.out.println("曲がります");
	}

	/**
	 * @return displacement
	 */
	public int getDisplacement() {
		return displacement;
	}

	/**
	 * @param displacement セットする displacement
	 */
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	/**
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color セットする color
	 */
	public void setColor(String color) {
		this.color = color;
	}
}