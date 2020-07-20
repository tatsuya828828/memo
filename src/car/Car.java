package car;

import engine.Engine;

public class Car {
	// あるクラスが別のクラスを利用することを依存という
	// 車がエンジンを使うため、車クラスはエンジンインタフェースに依存している事になる
	private Engine engine;

	// コンストラクタ
	public Car(Engine engine) {
		this.setEngine(engine);
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
