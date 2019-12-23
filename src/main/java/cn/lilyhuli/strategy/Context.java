package cn.lilyhuli.strategy;

/**
 * @author tangd-a
 * @date 2019/12/23 18:35
 */
public class Context {
	Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void ContextInterFace() {
		strategy.algorithmInterface();
	}

	public static void main(String[] args) {
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.ContextInterFace();
	}


}
