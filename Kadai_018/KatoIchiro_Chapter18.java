package Kadai_018;

// 子クラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	public void setGivenName() {
		this.givenName = "一郎";
	}

	// 抽象メソッドeachIntroduceに処理を記述
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
