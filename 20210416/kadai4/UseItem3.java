package kadai4;

public class UseItem3 {
	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setPrice(50000);
		System.out.println(item1.getName() + "は" + item1.getPrice() + "円です");

		Item item2 = new Item("空気清浄機", 20000);
		System.out.println(item2.getName() + "は" + item2.getPrice() + "円です");
	}
}
