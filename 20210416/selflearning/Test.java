package selflearning;

class ArrayMethod {
	public String[] msgs() {
		String[] strs = { "Hello", "Howdy", "Bye" };
		return strs;
	}
}

public class Test {
	public static void main(String[] args) {
		ArrayMethod obj = new ArrayMethod();
		String[] coms = obj.msgs();
		for (int i = 0; i < coms.length; i++) {
			System.out.println(coms[i]);
		}
	}

}
