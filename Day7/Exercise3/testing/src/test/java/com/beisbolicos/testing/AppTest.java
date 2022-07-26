package com.beisbolicos.testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.beisbolicos.testing.SimpleMat;

public class AppTest {
		    
	    @Test
	    public void testCheckSignShouldReturnPositive() {
	        SimpleMat sm = new SimpleMat();
	        assertEquals("positive", sm.checkSign(5));
	        assertEquals("positive", sm.checkSign(0));
	    }
	    
	    @Test
	    public void testCheckSignShouldReturnNegative() {
	        SimpleMat sm = new SimpleMat();
	        assertEquals("negative", sm.checkSign(-5));
	    }
	    
	}