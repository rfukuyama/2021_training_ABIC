package kadai5;

public class Book3 extends Item {

	private String auther;

	Book3() {
	}

	public Book3(String name, int price, String auther) {
		super(name, price);
		setAuther(auther);
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}
}
