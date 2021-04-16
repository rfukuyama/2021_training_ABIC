package Kadai6;

public class Character {
	// フィールド
	private String name;
	private int lifePoint;
	private int attackPower;

	// コンストラクタ
	public Character() {
	}

	public Character(String name, int lifePoint, int attackPower) {
		this.name = name;
		this.lifePoint = lifePoint;
		this.attackPower = attackPower;
	}

	// ゲッター、セッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifePoint() {
		return lifePoint;
	}

	public void setLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	// 情報表示のメソッド
	public void showInfo() {
		System.out.println(name + "（HP:" + lifePoint
				+ "/攻撃力:" + attackPower + "）");
	}
}