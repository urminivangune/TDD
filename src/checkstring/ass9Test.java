package checkstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ass9Test {

	@Test
	void test() {
		assertEquals("This Red car", ass9.removespecial("This@ Red $car-."));
	}

}
