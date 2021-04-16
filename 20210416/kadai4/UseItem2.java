package kadai4;

public class UseItem2 {
	public static void main(String[] args) {
		// 空の商品オブジェクトを生成
		Item item = new Item();
		// セッターを使って商品名（ロボット掃除機）と値段（50000）をセット
		item.setName("ロボット掃除機");
		item.setPrice(50000);
		// ゲッターを利用して商品の情報を出力する
		System.out.println(item.getName() + "は" + item.getPrice() + "円です");
	}
}
