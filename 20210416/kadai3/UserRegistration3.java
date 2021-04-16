package kadai3;

import java.util.Scanner;

public class UserRegistration3 {
	public static void main(String[] args) {

		String userId, userPw;
		Scanner scan = new Scanner(System.in);
		System.out.print("登録するユーザIDを入力してください：");
		userId = scan.nextLine();
		if (userId.length() <= 20) {
			System.out.print("登録するパスワードを入力してください：");
			userPw = scan.nextLine();
			if (userPw.length() >= 8) {
				System.out.println("ユーザID：" + userId + "、パスワード：" + userPw + "で登録しました。");
				System.out.println("ログイン処理を行います。");
				System.out.print("ログインするユーザIDを入力してください：");
				String logId = scan.nextLine();
				System.out.print("パスワードを入力してください：");
				String logPw = scan.nextLine();
				if (userId.equals(logId) && userPw.equals(logPw)) {
					System.out.println("ログインしました。");
				} else {
					System.out.println("ユーザIDとパスワードが一致しませんでした。");
				}
			} else {
				System.out.println("パスワードは8文字以上で入力してください。");
			}
		} else {
			System.out.println("ユーザIDは20文字以内で入力してください。");
		}
	}
}
