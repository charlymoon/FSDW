package com.beisbolicos.testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
	//@Test
	@ParameterizedTest
	@ValueSource(ints={5,0,9,3})
    public void testCheckSignShouldReturnPositive(int ints) {
        MySimpleMath sm = new MySimpleMath();
        assertEquals("positive", sm.checkSign(ints));
        //assertEquals("positive", sm.checkSign(0));
    }
    
    @Test
    public void testCheckSignShouldReturnNegative() {
        MySimpleMath sm = new MySimpleMath();
        assertEquals("negative", sm.checkSign(-5));
    }
    
    @Test
    public void testDivisionShouldReturnPositiveQuotient() {
        MySimpleMath sm = new MySimpleMath();
        assertEquals(2.0, sm.divide(10, 5), 0);
        assertEquals(0.0, sm.divide(0, 5), 0);
    }
    
    @Test
    public void testDivisionShouldReturnNegativeQuotient() {
        MySimpleMath sm = new MySimpleMath();
        assertEquals(-2.0, sm.divide(10, -5), 0);
    }
    
    @Test 
    public void testDivisionShouldThrowArithmeticException() {
        MySimpleMath sm = new MySimpleMath();
        assertThrows(ArithmeticException.class, () -> sm.divide(5, 0));
    }
	}