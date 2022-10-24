package test.java.calc;

import static org.junit.Assert.*;

import main.java.CalculatorMain;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    private static CalculatorMain calc;

    @BeforeClass
    public static void setup(){
        calc = new CalculatorMain();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(3,2));
    }
    @Test
    public void testSub() {
        assertEquals(3, calc.sub(9,6));
    }
    @Test
    public void testDivByZero() {
        assertEquals(0, calc.div(3,0));
    }
    @Test
    public void testMul() { assertEquals(10, calc.mul(5,2)); }
    @Test
    public void testPresedence() {
        assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
    }
    @Test
    public void testDiv() { assertEquals(2, calc.div(10,5));
    }
}