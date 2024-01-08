package tests;

import classes.Mathematics;
import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.Test;

public class MathematicsTest {
    private Mathematics m;

    @Before
    public void setup() {
        m = new Mathematics();
        System.out.println("Object initialized");
    }

    @Test
    public void addTwoNumbersTest() {
        // AAA
        // Arange -> Partea in care pregatim metoda
        // Act -> Partea in care se actioneaza (Apelam metoda)
        int actualRezult = m.addTwoNumbers(1, 2);
        // Assert -> Partea in care se adevereste ca rezultatul este cel dorit (expected)
        int expectedRezult = 3;
        Assert.assertEquals(expectedRezult, actualRezult);
    }

    @Test
    public void calculateAvarageTest() {
        int actualRezult = m.calculateAvarage(1, 2, 3);
        int expectedRezult = 2;
        Assert.assertEquals(expectedRezult, actualRezult);
    }

    @Test
    public void findMaxWhenSecondArgumentIsGreaterTest() {
        int actualResult = m.findMax(1, 2);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findMaxWhenFirstArgumentIsGreaterTest() {
        int actualResult = m.findMax(2, 1);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
