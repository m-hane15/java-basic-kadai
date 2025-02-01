package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//辞書として機能するHashMapを宣言（変数dictMap生成）
	HashMap<String, String> dictMap = new HashMap<String, String>();

	//【メソッド】生成したdictMapに英単語とその意味を追加
	public void setDict() {
		dictMap.put("apple", "りんご");
		dictMap.put("peach", "桃");
		dictMap.put("banana", "バナナ");
		dictMap.put("lemon", "レモン");
		dictMap.put("pear", "梨");
		dictMap.put("kiwi", "キウィ");
		dictMap.put("strawberry", "いちご");
		dictMap.put("grape", "ぶどう");
		dictMap.put("muscat", "マスカット");
		dictMap.put("cherry", "さくらんぼ");
	}

	//【メソッド】調べる英単語が辞書にあるか検索
	public void dictSearch(String[] word) {
		//辞書で調べた英単語の意味を格納する変数を用意
		String meaning = "";

		//調べる英単語の配列の個数分だけ処理を繰り返す
		for (int i = 0; i < word.length; i++) {
			//調べた英単語に対応する意味を取得し変数に代入
			meaning = dictMap.get(word[i]);

			//調べた英単語が辞書になかった場合、辞書に存在しない旨を表示
			if (meaning == null) {
				System.out.println(word[i] + "は辞書に存在しません");
			}
			//調べた英単語が辞書にあった場合、意味を表示
			else {
				System.out.println(word[i] + "の意味は" + meaning);
			}
		}
	}

}
