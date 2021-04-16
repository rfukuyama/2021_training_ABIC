package jbasic;

import java.util.Scanner;

public class Lesson4_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("商品の値段を入力してください：");
		int price = scan.nextInt();

		int priceWithTax = (int) (price * 1.1);
		System.out.println("消費税(10%)込みの値段： " + priceWithTax);
	}
}
