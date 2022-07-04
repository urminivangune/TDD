package Email;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
class EmailPassTest {

	@Test
	void test() throws Exception {		
		assertTrue(EmailPass.checkdetails("urmila@gmail.com", "urmila1234"));
	}
	
	}
