package checkArrayString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ass10Test {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon", ass10.checkArrayString(new String[] {"apple","orange","banana","lemon"} ));
		
	}

}
