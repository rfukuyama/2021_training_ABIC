package kadai4;

public class Item4 {

	private String name;
	private int price;

	public Item4() {
	}

	public Item4(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println(name + "は" + price + "円です");
	}
}
