package selflearning;

class Account {
	// メンバー変数
	int balance;

	void setBalance(int aBalance) {
		// 自分のクラスのメンバー変数へのアクセス
		balance = aBalance;
	}

	int getBalance() {
		// 自分のクラスのメンバー変数へのアクセス
		return balance;
	}
}

class AccountManager {
	void transfer(Account account, int ammount) {
		// オブジェクトのメンバー変数へのアクセス
		account.balance += ammount;
	}
}

class AccountDemo {
	public static void main(String[] args) {
		// オブジェクトの生成
		Account obj = new Account();
		// オブジェクトのメソッドの利用
		obj.setBalance(1000);
		System.out.println(obj.getBalance());
		// オブジェクトの生成
		AccountManager obj2 = new AccountManager();
		// オブジェクトのメソッドの利用
		obj2.transfer(obj, 100);
		System.out.println(obj.getBalance());
	}
}