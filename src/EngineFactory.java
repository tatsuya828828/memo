import engine.Engine;
import engine.HondaEngineVer2;
import engine.NissanEngine;

// Factoryクラスはインスタンスを生成するクラスで、よくJavaで使われる技法である
public class EngineFactory {

	public static Engine createHondaEngine() {
		return new HondaEngineVer2();
	}

	public static Engine createNissanEngine() {
		return new NissanEngine();
	}
}
