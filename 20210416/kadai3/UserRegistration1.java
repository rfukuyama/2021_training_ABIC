package kadai3;

import java.util.Scanner;

public class UserRegistration1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("登録するユーザIDを入力してください：");
		String userId = scan.nextLine();
		System.out.print("登録するパスワードを入力してください：");
		String userPw = scan.nextLine();
		System.out.println("ユーザID：" + userId + "、パスワード：" + userPw + "で登録しました。");
	}
}