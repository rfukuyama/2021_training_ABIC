package quiz;

public class Quiz3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (i % 10 == 0) {
				System.out.println(sum);
			}
		}
	}
}

/*	public static void main(String[] args) {
		int i = 0; //(1)
		while (i <= 100) { //(2)
		if (i % 10 == 0){
			System.out.println("iは" + i + "です。"); //(3)
			i++; //(4)
		}
		}
	}
}*/