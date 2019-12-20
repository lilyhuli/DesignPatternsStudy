package cn.lilyhuli.factory.simple.homework;

/**
 * @author tangd-a
 * @date 2019/12/20 16:48
 */
public class CashNormal extends CashSuper {
	@Override
	public double acceptCash(double money) {
		return money;
	}
}
