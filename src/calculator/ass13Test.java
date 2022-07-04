package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ass13Test {

	@Test
	void testsum(){
		assertEquals(-1, ass13.sum(12, -13));
		}
		
		
		@Test
		void testsub(){
		assertEquals(-1, ass13.sub(12,13));
		}
		
		@Test
		void testmul(){
		assertEquals(-0, ass13.mul(0,13));
		assertEquals(+0, ass13.mul(13,0));
		
		}

		
		@Test
		void testdiv() throws Exception{
		assertEquals(-0, ass13.div(0,1));
		}
		
		@Test
		void testmod() throws Exception{
		assertEquals(0, ass13.mod(12,1));
		}
		
		@Test
		void testpow() throws Exception{
		assertEquals(1, ass13.power(1,0));
		}
		
		@Test
		void testsqrt() throws Exception{
		assertEquals(12, ass13.squareroot(144));
		}
		
		
		@Test
		void testqbrt() throws Exception{
		assertEquals(5, ass13.quberoot(125));
		}

}
