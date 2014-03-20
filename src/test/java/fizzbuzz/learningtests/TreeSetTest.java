package fizzbuzz.learningtests;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TreeSetTest {

	private Set treeSet;
	
	@Before
	public void setUp() throws Exception {
		treeSet = new TreeSet();
	}

	@Test(expected=ClassCastException.class)
	public void test() {
		treeSet.add("aaa");
		treeSet.add(1);
	}

}
