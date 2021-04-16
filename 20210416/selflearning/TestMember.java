package selflearning;

public class TestMember {
	//メンバ変数
	private static int i;
	private static double d;
	private static char c;
	private static boolean b;
	private static String a[] = new String[3];

	public static void main(String[] args) {
		System.out.println(" int: " + i);
		System.out.println(" double: " + d);
		System.out.println(" char:" + c);
		System.out.println("boolean: " + b);
		System.out.println(" 参照型: " + a[0] + ", " + a[1] + ", " + a[2]);

	}

}