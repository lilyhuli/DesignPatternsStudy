package cn.lilyhuli.factory.geek.composition;

/**
 * @author tangd-a
 * @date 2020/3/19 14:15
 */
public class TweetAbility implements Tweetable {

	@Override
	public void tweet() {
		System.out.println("i can tweet");
	}
}
