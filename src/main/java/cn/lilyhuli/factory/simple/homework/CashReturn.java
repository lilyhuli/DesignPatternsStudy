package cn.lilyhuli.factory.simple.homework;

/**
 * @author tangd-a
 * @date 2019/12/20 16:50
 */
public class CashReturn extends CashSuper {
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;

	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.valueOf(moneyCondition);
		this.moneyReturn = Double.valueOf(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {

		double result =money;
		if (money >= moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}
}
