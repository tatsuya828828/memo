import car.Car;
import engine.Engine;
import engine.HondaEngine;

public class Main {
	public static void main(String[] args) {
		// パーツの生成
		// 車クラスはエンジンインタフェースに依存しているがエンジンインタフェース経由で代入されていて
		// 直接の関わりがないホンダエンジンクラスには依存していない
		// 抽象的なインタフェースを使えば、違うエンジンに変えたいときにも対応しやすく、依存度合いを低くすることができる
		// このように依存度が低い状態のことを疎結合という、Javaでは、インタフェースを使っていれば疎結合となる。
		// 逆に具体性の高い、クラスなどに依存するときは依存度合いが高く、そういった状態のことを密結合という
		Engine engine = new HondaEngine();
		// 車の生成
		Car car = new Car(engine);
		car.getEngine().boot();
		car.getEngine().stop();

		// メソッドをstaticにすることで、Factoryクラスを生成しなくてもメソッドを呼び出せる
		// Factoryメソッドを使うことでnewするクラスが変わった場合、メソッドの中身だけを変えるだけで済むようになる
		// つまり変更に対応しやすくなる
		Engine engine2 = EngineFactory.createHondaEngine();
		Car car2 = new Car(engine2);
		car2.getEngine().boot();
		car2.getEngine().stop();
	}
}
