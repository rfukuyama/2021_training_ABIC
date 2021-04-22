package kadai4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int code;
		String name;
		int age;
		String tel;

		System.out.print("コードを入力してください：");
		code = scan.nextInt();
		System.out.print("名前を入力してください：");
		name = scan.next();
		System.out.print("年齢を入力してください：");
		age = scan.nextInt();
		System.out.print("電話番号を入力してください：");
		tel = scan.next();
		scan.nextLine();

		try {
			// JDBCドライバの登録
			Class.forName("org.postgresql.Driver");
			// URL、ユーザ名、パスワードの設定
			String url = "jdbc:postgresql:sample";
			String user = "student";
			String pass = "himitu";
			// データベースへの接続
			Connection con = DriverManager.getConnection(url, user, pass);
			// SQL文の作成
			String sql = "INSERT INTO emp(code, name, age, tel) VALUES(?, ?, ?, ?)";
			// PreparedStatementオブジェクトの取得
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, code);
			st.setString(2, name);
			st.setInt(3, age);
			st.setString(4, tel);
			// SQLの実行
			int rows = st.executeUpdate();
			System.out.println(rows + "件、レコードを登録しました。");
			sql = "SELECT * FROM emp ORDER BY code";
			// PreparedStatementオブジェクトの取得
			st = con.prepareStatement(sql);
			// SQLの実行
			ResultSet rs = st.executeQuery();
			// 結果の取得および表示
			while (rs.next()) {
				System.out.print(rs.getInt("code") + " : ");
				System.out.print(rs.getString("name") + " : ");
				System.out.print(rs.getInt("age") + " : ");
				System.out.println(rs.getString("tel"));
			}
			// リソースの開放
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
