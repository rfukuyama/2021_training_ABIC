package kadai1;

import java.util.Scanner;

public class Checklnteger3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("数字を入力してください: ");
			int input = s.nextInt(); // 取得
			if (input >= 0) {
				if (input % 2 == 0) {
					System.out.println(input + "は正の偶数です。");
				} else {
					System.out.println(input + "は正の奇数です。");
				}
			} else {
				if (input % 2 == 0) {
					System.out.println(input + "は負の偶数です。");
				} else {
					System.out.println(input + "は負の奇数です。");
				}
			}
		}
	}
}