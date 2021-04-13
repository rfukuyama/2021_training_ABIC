package jbasic;

import java.util.Scanner;

public class Lesson4_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int english, mathmetics, science;
		System.out.print("英語：");
		english = scan.nextInt();
		System.out.print("数学：");
		mathmetics = scan.nextInt();
		System.out.print("理科：");
		science = scan.nextInt();

		int total = english + mathmetics + science;
		double average = total / 3.0;

		System.out.println("合計： " + total);
		System.out.println("平均： " + average);
	}
}