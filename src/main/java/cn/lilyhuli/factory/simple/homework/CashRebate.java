package cn.lilyhuli.factory.simple.homework;

/**
 * @author tangd-a
 * @date 2019/12/20 16:51
 */
public class CashRebate  extends CashSuper{

	private double moneyRebate = 1d;

	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.valueOf(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return money*moneyRebate;
	}
}
