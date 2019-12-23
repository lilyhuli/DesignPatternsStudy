package cn.lilyhuli.strategy;

import java.io.Console;

/**
 * @author tangd-a
 * @date 2019/12/23 18:32
 */
public class ConcreteStrategyA extends Strategy {
	@Override
	public void algorithmInterface() {
		//算法a实现
		System.out.println("算法a实现");
	}
}
