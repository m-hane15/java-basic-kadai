package Kadai_015;

public class Car_Chapter15 {
	// フィールド
	private int gear = 1; //	1速から5速のギアを表す	
	private int speed = 10; // ギアチェンジ後の速度を表す	

	// コンストラクタ
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	// 【メソッド】 ギアチェンジにより速度を変える
	// 引数afterGear：変更後のギア
	public void gearChange(int afterGear) {
		// ギアチェンジ内容を表示
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

		// ギアを変更後のギアに更新
		this.gear = afterGear;

		// ギアに応じて速度を変更
		this.speed = switch (this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}

	// 【メソッド】  走行時にギアチェンジ後の速度を表示
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
