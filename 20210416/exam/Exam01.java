package exam;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("名前を入力してください：");
		String name = scan.nextLine();

		System.out.print("現在の年齢を入力してください：");
		int age = scan.nextInt();

		System.out.println(name + "さんの10年後は" + (age + 10) + "歳です");

	}

}