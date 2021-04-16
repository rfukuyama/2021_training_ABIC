package kadai5;

public class Book4 extends Item {
	private String auther;

	Book4() {
	}

	public Book4(String name, int price, String auther) {
		super(name, price);
		setAuther(auther);
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public void showInfo() {
		System.out.println(getName() + "(" + getAuther() + ")は" + getPrice() + "円です");
	}
}
