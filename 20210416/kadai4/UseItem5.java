package kadai4;

public class UseItem5 {
	public static void main(String[] args) {

		Item4[] items = {
				new Item4("ロボット掃除機", 50000),
				new Item4("空気清浄機", 20000),
				new Item4("扇風機", 4000)
		};

		//繰り返し処理
		for (Item4 item : items) {
			item.showInfo();
		}
	}
}
