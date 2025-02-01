package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		//辞書クラスのインスタンス作成
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();

		//辞書に英単語と意味を追加するメソッドを実行
		dict.setDict();

		//調べる英単語を配列にセットする
		String[] wordArray = { "apple", "banana", "grape", "orange" };

		//セットした英単語の配列を辞書検索メソッドに渡して実行する
		dict.dictSearch(wordArray);

	}
}
