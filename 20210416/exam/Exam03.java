package exam;

import java.util.Random;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* 変数宣言 */
		int cpuHand; // コンピュータの手 0:グー 1:チョキ 2: パー
		int myHand; // プレイヤーの手   0:グー 1:チョキ 2: パー
		int result; // 勝敗の結果      0:負け 1:引き分け 2:勝ち -1:エラー

		/* メイン処理 */
		outputMessage();
		cpuHand = generateCpuHand();
		myHand = inputMyHand();
		outputHand(cpuHand, myHand);
		result = judgeHand(cpuHand, myHand);
		outputMessage(result);

	}

	public static void outputMessage() {
		System.out.println("1:グー、2:チョキ、3:パー から選択してください。");
		System.out.print("じゃん、けん、、、");
	}

	public static void outputMessage(int messageType) {
		/* 定数宣言 */
		final int LOSE = 0; // 負け
		final int DRAW = 1; // 引き分け
		final int WIN = 2; // 勝ち
		/* メッセージ出力 */
		switch (messageType) {
		case LOSE:
			System.out.println("あなたの負けです");
			break;
		case DRAW:
			System.out.println("引き分けです");
			break;
		case WIN:
			System.out.println("あなたの勝ちです");
			break;
		default:
			System.out.println("1:グー、2:チョキ、3:パー から選択してください。");
		}
	}

	public static int generateCpuHand() {
		Random rand = new Random();
		int hand = rand.nextInt(3);
		return hand;
	}

	public static int inputMyHand() {
		Scanner scan = new Scanner(System.in);
		int hand = scan.nextInt();
		scan.close();
		return hand;
	}

	public static void outputHand(int cpuHand, int myHand) {
		System.out.print("あなたは" + toHandName(myHand) + "、");
		System.out.println("コンピュータは" + toHandName(cpuHand));
	}

	public static String toHandName(int hand) {
		String handName;
		if (hand == 1)
			handName = "グー";
		else if (hand == 2)
			handName = "チョキ";
		else if (hand == 3)
			handName = "パー";
		else
			handName = "？";
		return handName;
	}

	public static int judgeHand(int cpuHand, int myHand) {
		/* 変数宣言 */
		int rc; // リターンコード
		/* 定数宣言 */
		final int ROCK = 0; // グー
		final int SCISSORS = 1; // チョキ
		final int PAPER = 2; // パー
		final int LOSE = 0; // 負け
		final int DRAW = 1; // 引き分け
		final int WIN = 2; // 勝ち
		/* 勝敗判定 */
		if (cpuHand == ROCK && myHand == ROCK)
			rc = DRAW;
		else if (cpuHand == ROCK && myHand == SCISSORS)
			rc = LOSE;
		else if (cpuHand == ROCK && myHand == PAPER)
			rc = WIN;
		else if (cpuHand == SCISSORS && myHand == ROCK)
			rc = WIN;
		else if (cpuHand == SCISSORS && myHand == SCISSORS)
			rc = DRAW;
		else if (cpuHand == SCISSORS && myHand == PAPER)
			rc = LOSE;
		else if (cpuHand == PAPER && myHand == ROCK)
			rc = LOSE;
		else if (cpuHand == PAPER && myHand == SCISSORS)
			rc = WIN;
		else if (cpuHand == PAPER && myHand == PAPER)
			rc = DRAW;
		else
			rc = -1; // エラー
		return rc;
	}

}