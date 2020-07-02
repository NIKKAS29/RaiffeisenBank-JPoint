package tasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Task4Test {
    private Integer inputNumber;
    private Boolean expectedResult;

    public Task4Test(Integer inputText, Boolean expectedResult) {
        this.inputNumber = inputText;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name="Is {0} prime number => {1}")
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {5, true},
                {3, true},
                {47, true},
                {48, false},
                {-7, false},
                {0, false},
                {997553, true},
                {997557, false},
        });
    }

    @Test
    public void testPrimeNumberChecker() {
        assertEquals(expectedResult, Task4.isPrime(inputNumber));
    }
}
