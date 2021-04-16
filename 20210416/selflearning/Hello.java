package selflearning;

class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, Java");
		//インスタンス化
		Bye sato = new Bye();
		Bye suzuki = new Bye();
		//一つのクラスから二つのインスタンスを作っている。
		//メソッド呼び出し
		sato.setSayonara("さようなら");
		suzuki.setSayonara("バイバイ");
		//メンバ変数へのアクセス
		System.out.print("sato: ");
		System.out.println(sato.sayonara);
		System.out.print("suzuki: ");
		System.out.println(suzuki.sayonara);
	}
}

class Bye {
	//メンバ変数
	String sayonara;

	//メソッド
	void setSayonara(String bye) { //戻り値なし。
		sayonara = bye; //このメソッドの引数がメンバ変数にセットされる。
	}
}