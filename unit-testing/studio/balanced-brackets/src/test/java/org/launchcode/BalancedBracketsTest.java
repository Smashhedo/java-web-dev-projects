package org.launchcode;

import org.junit.jupiter.api.Test;
import org.launchcode.BalancedBrackets;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringAndBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void bracketsAndStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringInsideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void manyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void manyBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }
    @Test
    public void stringInsideBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[Code"));
    }
    @Test
    public void bracketsAndStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode"));
    }
    @Test
    public void onlyBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void stringAndBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));
    }

    @Test
    public void manyBracketsAndStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }

}