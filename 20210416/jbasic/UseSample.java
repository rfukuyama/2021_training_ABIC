package jbasic;

class Sample {
	int a;
	int b;

	int sum() {
		return a + b;
	}
}

class UseSample {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		s1.a = 10;
		s1.b = 20;
		s2.a = -30;
		s2.b = 100;
		System.out.println("インスタンスs1のaは" + s1.a);
		System.out.println("インスタンスs1のbは" + s1.b);
		System.out.println("インスタンスs1のaとbの合計は" + s1.sum());

		System.out.println("インスタンスs2のaは" + s2.a);
		System.out.println("インスタンスs2のbは" + s2.b);
		System.out.println("インスタンスs2のaとbの合計は" + s2.sum());
	}
}
