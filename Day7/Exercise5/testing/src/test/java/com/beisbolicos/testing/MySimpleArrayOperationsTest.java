package com.beisbolicos.testing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MySimpleArrayOperationsTest {
    private static MySimpleArrayOperations msao = new MySimpleArrayOperations();
    private static int[] array;
    
    @BeforeAll
    public static void initInstanceVariables() {
        //System.out.println(this.getClass().getName() + " --> initializing fields");
        msao = new MySimpleArrayOperations();
        array = new int[] {10, 2, 3, 10, 1, 0, 2, 3, 16, 0, 2};
    }
    
    @Test
    public void testFindMin() {
        assertEquals(0, msao.findMin(array));
        assertNotEquals(10, msao.findMin(array));
    }
    
    @Test 
    public void testFindMinShouldThrowException() {
        assertThrows(IllegalArgumentException.class,()->msao.findMin(new int[]{}));
    }
    
    @Test
    public void testMultiply() {
        msao.multiply(array, 10);
        assertArrayEquals(new int[]{100, 20, 30, 100, 10, 0, 20, 30, 160, 0, 20}, array);
    }
    
    @Test 
    public void testMultiplyShouldThrowException() {
        assertThrows(IllegalArgumentException.class, ()->msao.multiply(new int[]{}, 0)); //method call with dummy arguments
    }
    
}