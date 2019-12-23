package cn.lilyhuli.factory.simple.homework;

/**
 * @author tangd-a
 * @date 2019/12/20 20:16
 */
public class Client {
	public static void main(String[] args) {
		CashSuper cashSuper;
		String sale;

		sale = "满300反100";
		CashSuper accept = CashFactory.createCashAccept(sale);
		double saleMoney = accept.acceptCash(900d);
		System.out.println(saleMoney);
	}

}
