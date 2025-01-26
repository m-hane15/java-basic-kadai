package Kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {

		// 車クラスのインスタンスを作成
		Car_Chapter15 car = new Car_Chapter15(1, 10);

		// gearChangeメソッドを実行してギアを3に変更
		car.gearChange(3);

		//runメソッドを実行してギアチェンジ後の速度を表示
		car.run();

	}
}
