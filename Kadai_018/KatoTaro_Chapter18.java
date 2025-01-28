package Kadai_018;

// 子クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public void setGivenName() {
		this.givenName = "太郎";
	}

	// 抽象メソッドeachIntroduceに処理を記述
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}
