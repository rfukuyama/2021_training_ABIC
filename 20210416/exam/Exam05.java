package exam;

public class Exam05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Book[] books = {
				new Book("きめつの歯", 500, 10, "小峠"),
				new Book("竜玉", 600, 4, "鳥山")
		};

		// 各メソッドを呼び出し
		for (Book book : books) {
			book.showInfo(); // 本の情報を表示
			book.buy(3); // 3冊購入
			book.showInfo(); // 本の情報を表示
			System.out.println();
		}
	}
}

class Goods {
	private String name; // 商品名
	private int price; // 価格
	private int count; // 在庫数
	// コンストラクタ

	public Goods(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	// 商品情報表示メソッド
	public void showInfo() {
		System.out.println("★商品情報★");
		System.out.print("商品名:" + name);
		System.out.print("/価格:" + price);
		System.out.print("/個数:" + count);
	}

	// 購入メソッド
	public void buy(int count) {
		System.out.println(name + "を" + count + "冊購入します");
		this.count -= count;
		if (this.count < 0) {
			count = 0;
		}
	}
}

class Book extends Goods {
	private String author;

	public Book(String name, int price, int count, String author) {
		super(name, price, count);
		this.author = author;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("著者:" + author);
	}

}
