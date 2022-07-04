package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ass11Test {

	@Test
	
	void test() {
		Singleton st1=Singleton.getSingleton();
		Singleton st2=Singleton.getSingleton();
	assertTrue(ass11.checksingleton(st1, st2));
	}
}
