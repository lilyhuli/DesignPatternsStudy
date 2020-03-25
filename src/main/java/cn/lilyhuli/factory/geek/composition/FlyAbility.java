package cn.lilyhuli.factory.geek.composition;

/**
 * @author tangd-a
 * @date 2020/3/19 14:15
 */
public class FlyAbility implements Flyable {
	@Override
	public void fly() {
		System.out.println("i can fly");
	}
}
