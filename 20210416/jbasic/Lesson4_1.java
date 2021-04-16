/**
 * 
 */
package jbasic;

import java.util.Scanner;

class Lesson4_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("三角形の底辺を入力してください：");
		int base = scan.nextInt();
		System.out.print("三角形の高さを入力してください：");
		int height = scan.nextInt();

		double area = base * height / 2.0;
		System.out.println("三角形の面積： " + area);
	}
}