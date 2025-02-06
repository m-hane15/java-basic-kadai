package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//【メソッド】自分のじゃんけんの手を入力する
	public String getMyChoice() {
		//じゃんけんゲームの遊び方を出力
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		//Scannerクラスのオブジェクトを生成
		Scanner scanner = new Scanner(System.in);

		//入力した文字を代入する変数を用意
		String myChoice = "";

		//正しい入力かどうか判定し、正しく入力されるまでループする
		while (true) {

			//入力した文字を取得し、変数myChoiceに代入
			myChoice = scanner.next();

			//正しい入力の場合、scannerクラスをcloseしてループを抜ける
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				scanner.close();
				break;

				//正しくない場合、再入力を促す
			} else {
				System.out.println("エラー：正しいじゃんけんの手ではありません。再度入力してください。");
			}

		}

		//自分のじゃんけんの手を返す
		return myChoice;

	} //getMyChoiceメソッドここまで

	//【メソッド】対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {

		//配列にじゃんけんの手をセットする
		String[] hands = { "r", "s", "p" };

		//乱数を生成し、配列から対戦相手のじゃんけんの手を取得して返す
		int i = (int) Math.floor(Math.random() * 3);
		String randChoice = hands[i];
		return randChoice;

	} //getRandom文ここまで

	//【メソッド】じゃんけんを行う
	public void playGame() {

		//じゃんけんの手のHashMapを作成
		HashMap<String, String> handMap = new HashMap<String, String>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");

		//自分と対戦相手のじゃんけんの手を出力
		String myHand = getMyChoice();
		String randHand = getRandom();

		System.out.println("自分の手は" + handMap.get(myHand) + ", 対戦相手の手は" + handMap.get(randHand));

		//自分と対戦相手のじゃんけんの手を比較し、結果を出力する
		//あいこ
		if (myHand.equals(randHand)) {
			System.out.println("あいこです");
			//自分がグー、相手がチョキ
		} else if (myHand.equals("r") && randHand.equals("s")) {
			System.out.println("自分の勝ちです");
			//自分がグー、相手がパー		
		} else if (myHand.equals("r") && randHand.equals("p")) {
			System.out.println("自分の負けです");
			//自分がチョキ、相手がグー
		} else if (myHand.equals("s") && randHand.equals("r")) {
			System.out.println("自分の負けです");
			//自分がチョキ、相手が相手がパー			
		} else if (myHand.equals("s") && randHand.equals("p")) {
			System.out.println("自分の勝ちです");
			//自分がパー、相手がグー
		} else if (myHand.equals("p") && randHand.equals("r")) {
			System.out.println("自分の勝ちです");
			//自分がパー、相手がチョキ
		} else if (myHand.equals("p") && randHand.equals("s")) {
			System.out.println("自分の負けです");
			//それ以外はエラー
		} else {
			System.out.println("エラー");
		}

	} //playGameメソッドここまで

}
