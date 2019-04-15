import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testDivisionTwoValues() {
        assertEquals("10 / 5 must be 2", 2, calc.division(10, 5));
    }

    @Test
    public void testSubtractionTwoValues() {
        assertEquals("10 - 5 must be 5", 5, calc.subtraction(10, 5));
    }

    @Test
    public void testSquareStraightTraveler() {
        assertEquals("10.1 * 5.0 must be 50.5", 50.5, calc.square(10.1, 5.0));
    }

    @Test
    public void testRootValue() {
        assertEquals("Root 9=3", 3.0, calc.root(9));
    }

    @Test
    public void testValueToSquare() {
        assertEquals("Root 9=3", 25.0, calc.valueToSquare(5));
    }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}

