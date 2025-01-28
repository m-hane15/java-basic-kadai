package Kadai_018;

// 子クラスを実行するクラス
public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// 子クラスのインスタンス作成
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

		// 太郎のsetGivenNameメソッド実行
		taro.setGivenName();
		//太郎のexecIntroduceメソッド実行
		taro.execIntroduce();

		// 一郎の各メソッド実行
		ichiro.setGivenName();
		ichiro.execIntroduce();

		// 花子の各メソッド実行
		hanako.setGivenName();
		hanako.execIntroduce();

	}

}
