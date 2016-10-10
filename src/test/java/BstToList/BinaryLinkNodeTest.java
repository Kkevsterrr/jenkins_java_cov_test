package BstToList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryLinkNodeTest {

	@Test
	public void buildLink() {
		BinaryLinkNode head = new BinaryLinkNode(4);
		assertEquals("[4]", head.toString());
		head.append(6);
		head.append(8);
		assertEquals("[4,6,8]", head.toString());
	}
}
