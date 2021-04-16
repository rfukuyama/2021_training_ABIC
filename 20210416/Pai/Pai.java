package Pai;

import java.util.Random;

public class Pai {
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double tPI = calcPI(150000, 1683007, 4);

		System.out.println(tPI);
	}

	/**
	* PIをモンテカルロ法で求める。
	*
	* @param aTimes 試行回数
	* @param aSeed 乱数シード
	* @param aNumOfDec 小数点以下の桁数
	* @return
	*/
	private static double calcPI(long aTimes, long aSeed, int aNumOfDec) {
		Random tRnd = new Random(aSeed);
		double tLength;
		long tCount = 0;

		for (int i = 0; i < aTimes; i++) {
			tLength = Math.hypot(tRnd.nextDouble(), tRnd.nextDouble());
			if (tLength < 1.0) {
				tCount++;
			}
		}

		long tDec = (long) Math.pow(10, aNumOfDec);
		return (double) Math.round(4.0 * tCount * tDec / aTimes) / tDec;
	}
}