package exam;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = { 1, 3, 5, 4, 2 };

		Scanner scan = new Scanner(System.in);
		System.out.println("数値を入力してください:");
		int input = scan.nextInt();
		int count = 0;
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			num = array[i];
			if (input < num) {
				count++;
			}
		}
		System.out.println("配列の中には" + input + "より大きな数字が「" + count + "個」ありました");

	}

}