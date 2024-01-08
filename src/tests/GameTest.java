package tests;

import classes.Game;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GameTest {
    @Test
    public void playFizzBuzzWhenArgumentsIs3Test() {
        String actualResult = Game.playFizzBuzz(3);
        String expectedResult = "Fizz";

        Assert.assertEquals(actualResult, expectedResult, "Error: The result is not correct!");
    }

    @Test
    public void playFizzBuzzWhenArgumentsIs5Test() {
        String actualResult = Game.playFizzBuzz(5);
        String expectedResult = "Buzz";

        Assert.assertEquals(actualResult, expectedResult, "Error: The result is not correct!");
    }

    @Test
    public void playFizzBuzzWhenArgumentsIs15Test() {
        String actualResult = Game.playFizzBuzz(15);
        String expectedResult = "FizzBuzz";

        Assert.assertEquals(actualResult, expectedResult, "Error: The result is not correct!");
    }

    @Test
    public void playFizzBuzzWhenArgumentsIsErrorTest() {
        String actualResult = Game.playFizzBuzz(7);
        String expectedResult = String.valueOf(7);

        Assert.assertEquals(actualResult, expectedResult, "Error: The result is not correct!");
    }
}
