package tasks;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Task3Test {
    private String inputText;
    private String expectedResult;

    public Task3Test(String inputText, String expectedResult) {
        this.inputText = inputText;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name="{0} => {1}")
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {"AAAAA", "5A"},
                {"AAAAABBBC", "5A3BC"},
                {"", ""},
                {null, null},
                {"ABC", "ABC"},
                {"ABBBBBC", "A5BC"}
        });
    }

    @Test
    public void testPrimeNumberChecker() {
        assertEquals(expectedResult, Task3.compression(inputText));
    }
}