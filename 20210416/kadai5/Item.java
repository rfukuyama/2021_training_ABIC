package kadai5;

public class Item {
	private String name; //名前
	private int price; //値段

	public Item() {
	}

	public Item(String name, int price) {
		setName(name);
		setPrice(price);
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println(getName() + "は" + getPrice() + "円です");
	}
}
