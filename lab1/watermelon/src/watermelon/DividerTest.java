package watermelon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DividerTest {

	@Test
	void test1() {
		assertTrue(divider.can_be_divided(8) == true);
	}
	@Test
	void test2() {
		assertTrue(divider.can_be_divided(2) == false);
	}
	@Test
	void test3() {
		assertTrue(divider.can_be_divided(9) == false);
	}


}
