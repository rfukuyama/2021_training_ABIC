package jbasic;

public class Array2 {
	public static void main(String[] args) {
		int[] ary = { 10, 15, 12, 8 };
		System.out.println("配列aryの大きさは" + ary.length + "です");
		System.out.println("インデックス1は" + ary[1]);

		//for文をりようしてすべての情報を取得する
		for (int i = 0; i < ary.length; i++) {
			System.out.println("ary[" + i + "] = " + ary[i]);
		}

		// 拡張for文
		for (int data : ary) {
			System.out.println(data);
		}
	}
}