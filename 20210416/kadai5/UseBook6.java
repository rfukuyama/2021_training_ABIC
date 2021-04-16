package kadai5;

import java.util.ArrayList;
import java.util.List;

public class UseBook6 {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("ロボット掃除機", 50000));
		items.add(new Book4("きめつの刀", 450, "GO峠こよはる"));
		items.add(new Book4("竜の玉", 450, "烏山アキラ"));
		for (Item item : items) {
			item.showInfo();
		}
	}
}
